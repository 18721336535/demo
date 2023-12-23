# demo
assignment
## Requirement
### Requirement describe:
A freeform assignment
1.make it possible for our teams to do something interesting with this food trucks data
2.not limited by these ideas at all, but hopefully those are enough help spark your own creativity
### Data provided:  
Mobile_Food_Facility_Permit.csv
### Requirement Summary：
To create an application to manage and applying the data provided

## Requirement Evaluation, Data mining, Function Definition/Portrayal
What is the data value  for one who  living in the city of San Francisco,
the data can be used to provide  services to one as a  customer/consumer, services like easy to find foods one like,  and finding the nearest  truck location to customer.
1. Able to list all items in csv of Food Facility Permit
2. Able to get detail(including address,days hours, foods) info  by key word(s) appeared in LocationDescription
3. Provide your location(Latitude,Longitude) where you are, provide one the nearest truck location from you
4. Given food name(s) you like, output you the eligible and nearest truck location and address
...
## Implementation
### Step1. Choose Tech
Choose tech from tech stack to build an application with a way fast and easy to develop ,  deploy and matainence.
Java language: jdk21  (org doc : https://docs.oracle.com/en/java/javase/21/index.html)
Development frameworks: springboot3.2.1 (https://start.spring.io/)  and  related components
BuildTool: Maven3.5.1
Data store: Mysql5.7 (Navicat Premium11 as client) or H2
Deployment: docker container
Frontend tech: html, css, js(jquery + vue2.0)
![image](https://github.com/18721336535/demo/tempimage/springbootinit.png)

### Step2. Building Project / Business Coding/ Unit Testing
#### Backend
##### Data Pre-handling by trying to import to mysql
![image](https://github.com/18721336535/demo/tempimage/mysqlcontainer.png)
![image](https://github.com/18721336535/demo/tempimage/dataimportmysql.png)
After above, export as sql script( schema.sql and  data.sql),ready to load to H2 db
##### API Function Describe
1. List all items in csv of Food Facility Permit
2. Input key word(s) appeared in LocationDescription, output detail info (including address,dayshours, foods)
3. Input location(Latitude,Longitude) , output the nearest truck location from you
4. Input food name(s) , output list of truck location and address etc.

##### H2db  Config
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
![image](https://github.com/18721336535/demo/tempimage/h2console.png)
![image](https://github.com/18721336535/demo/tempimage/h2data.png)
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
use anotation on api
http://127.0.0.1:8080/swagger-ui/index.html
![image](https://github.com/18721336535/demo/tempimage/swgapis.png)
![image](https://github.com/18721336535/demo/tempimage/api1.png)
![image](https://github.com/18721336535/demo/tempimage/api2.png)

##### Frontend  UI
Web pages able user to input creterias to get data wanted.
http://127.0.0.1:8080/toolkit.html
default get all  items with no criteria
![image](https://github.com/18721336535/demo/tempimage/ui1.png)
with criteria: Noodles
![image](https://github.com/18721336535/demo/tempimage/ui2.png)
### Step3.  Deployment / Intergration Testing

##### Deployment Method
###### Windows: Manual way: exec cmd bat script to deploy jar
```
:: please modify your own env
set JAVA_HOME=D:\installers\jdk-21_windows-x64_bin\jdk-21.0.1
set CLASSPATH=.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools;
set Path=%JAVA_HOME%\bin;
java -jar demo-0.0.1-SNAPSHOT.jar
pause
```

###### Linux: Manual way shell deploy jar
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
###### Docker way: build docker file get image and docker run same
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

