# demo
assignment
## Requirement
### Requirement describe:
A freeform assignment
1.Make it possible for our teams to do something interesting with this food trucks data
2.Not limited by these ideas at all, but hopefully those are enough help spark your own creativity
### Data provided:
Mobile_Food_Facility_Permit.csv
### Requirement Summary：
Mining the value of the data, to create an application to make full use of it.

## Requirement Evaluation, Data mining, Function Definition/Portrayal
What is the data value, and for who(living in the city of San Francisco)
The data can be used to provide service. to serve customer/consumer who want to find foods easyly, or to find the nearest truck location to him.
1. Able to preview all the data items.
2. Given food name(s) you like, output you the eligible and nearest truck location and address.
3. Providing your location(Latitude,Longitude) where you are, get the nearest truck location from you
4. Get detail(including address,days hours, foods) by input key word(s) appeared in LocationDescription
   ...
## Implementation
### Step1. Choose Tech
Choose tech from tech stack to build an application with a way that can fast and easy to develop, deploy and matainence.
Java language: jdk21  (org doc : https://docs.oracle.com/en/java/javase/21/index.html)
Development frameworks: springboot3.2.1 (https://start.spring.io/)  and  related components
BuildTool: Maven3.5.1
Data store: H2DB or Mysql 5.7, Navicat Premium11 as client
Deployment: docker container
Frontend tech: html, css, js(jquery + vue2.0)
![image](https://github.com/18721336535/demo/blob/main/tempimage/springbootinit.png)

### Step2. Building Project / Business Coding/ Unit Testing
#### Backend
##### Data Pre-handling by trying to import to mysql
![image](https://github.com/18721336535/demo/blob/main/tempimage/mysqlcontainer.png)
![image](https://github.com/18721336535/demo/blob/main/tempimage/dataimportmysql.png)
After above, export it out as sql script( schema.sql and  data.sql), to load it to H2 db for intergraion testing in dev stage.

##### API Function Describe
1. List all items (Food Facility Permit).
2. Input key word(s) appeared in LocationDescription, output the detail (including address,dayshours, fooditems).
3. Input location(Latitude,Longitude), output the nearest truck location from you.
4. Input food name(s), output the list of truck location and address etc. .

##### H2 DB Config
```
#h2 config
spring.datasource.url=jdbc:h2:mem:./testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=sa

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto= update

spring.sql.init.schema-locations=classpath:db/schema.sql
spring.sql.init.data-locations=classpath:db/data.sql
spring.h2.console.path=/h2
spring.h2.console.enabled=true
```
(http://127.0.0.1:8080/h2 UserName:sa   Password:sa)
![image](https://github.com/18721336535/demo/blob/main/tempimage/h2console.png)
![image](https://github.com/18721336535/demo/blob/main/tempimage/h2data.png)

##### Swagger Config
```
   <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
      <version>2.0.3</version>
  </dependency>
```
```
@Tag(name = "query", description = "Management APIs")
@RestController
public class DataMiningController {
 @Operation(summary = "FoodName", description = "Get Data By Food Name", tags = {"post"})
    @PostMapping("/getDataByFoodName")
    public ResponseEntity<List<MobileFoodFacilityPermit>> getDataFoodName(@RequestBody List<String> requestEntity) {
        MobileFoodFacilityPermitExample criteria = new MobileFoodFacilityPermitExample();
        try {
            requestEntity.stream().forEach( foodName -> criteria.createCriteria().andFooditemsLike("%"+foodName+"%") );
            List<MobileFoodFacilityPermit> list = mobileFoodFacilityPermitMapper.selectByExample(criteria);
            logger.info("getDataByFoodName:{}",JSON.toJSONString(list));
            return ResponseEntity.success(list);
        }catch(Exception e){
            logger.error("getDataByFoodName error:{}", e.getMessage());
            return ResponseEntity.failure(null);
        }
    }
 }
 ```
 ```
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEntity<T> {
    @Schema(description = "code", requiredMode = Schema.RequiredMode.REQUIRED)
    private int code;
    @Schema(description = "message", requiredMode = Schema.RequiredMode.REQUIRED)
    private String message;
    @Schema(description = "result data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private T data;

    public static <T>ResponseEntity<T> success(T data){
        return new ResponseEntity<>(DemoConstant.SUCCESS_CODE,DemoConstant.SUCCESS_STRING,data);
    }

    public static <T>ResponseEntity<T> failure(T data){
        return new ResponseEntity<>(DemoConstant.FAILURE_CODE,DemoConstant.FAILURE_STRING,data);
    }
}
```
API Doc And Testing
http://127.0.0.1:8080/swagger-ui/index.html
![image](https://github.com/18721336535/demo/blob/main/tempimage/swgapis.png)
![image](https://github.com/18721336535/demo/blob/main/tempimage/api1.png)
![image](https://github.com/18721336535/demo/blob/main/tempimage/api2.png)

##### Frontend UI
Web pages for user to input creteria to get the data wanted.
http://127.0.0.1:8080/toolkit.html

Default to respose all items if without criteria
![image](https://github.com/18721336535/demo/blob/main/tempimage/ui1.png)

Response with criteria: Noodles
![image](https://github.com/18721336535/demo/blob/main/tempimage/ui2.png)
### Step3.  Deployment / Intergration Testing

##### Deployment Method
###### Windows OS: Manual way to exec cmd bat script to deploy jar
/demo/deploy/app_startup.bat
```
:: please modify your own env
set JAVA_HOME=D:\installers\jdk-21_windows-x64_bin\jdk-21.0.1
set CLASSPATH=.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools;
set Path=%JAVA_HOME%\bin;
java -jar demo-0.0.1-SNAPSHOT.jar
pause
```

###### Linux: Manual way to exec shell script to deploy jar
/demo/deploy/app_starup.sh
```
#!/bin/sh
export LANG="en_US.UTF-8"
export JAVA_HOME=/usr/zbq/java/jdk-21.0.1
export PATH=\${JAVA_HOME}/bin:$PATH
export CLASSPATH=.:\${JAVA_HOME}/lib/dt.jar:\${JAVA_HOME}/lib/tools.jar

runMessage=`ps aux | grep \`cat pidfile.txt\``
startCommand="/usr/zbq/java/jdk-21.0.1/bin/java -jar demo-0.0.1-SNAPSHOT.jar"
if [[ $runMessage == *$startCommand* ]]
then
echo "App restarting..."
kill -9 `cat pidfile.txt`
nohup java -jar demo-0.0.1-SNAPSHOT.jar -java.tmp.dir=/home/zbq/temp >/dev/null 2>&1 & echo $! > pidfile.txt
else
echo "App starting..."
nohup java -jar demo-0.0.1-SNAPSHOT.jar -java.tmp.dir=/home/zbq/temp >/dev/null 2>&1 & echo $! > pidfile.txt
fi
```
###### Docker way: building docker file to get image and docker run to deploy
/demo/deploy/Dockerfile
```
#basic image
FROM java:21
#copy jar to docker /
ADD demo-0.0.1-SNAPSHOT.jar /demo-0.0.1-SNAPSHOT.jar
#define volume
VOLUME /tmp
#port
EXPOSE 8080
#run cmd
ENTRYPOINT ["java", "-jar","/demo-0.0.1-SNAPSHOT.jar"]
```
## Entry Url
http://127.0.0.1:8080/toolkit.html
