# basic image
FROM java:21
# copy jar to docker /
ADD demo-0.0.1-SNAPSHOT.jar /demo-0.0.1-SNAPSHOT.jar
#define volume
VOLUME /tmp
# port
EXPOSE 8080
# run cmd
ENTRYPOINT ["java", "-jar","/demo-0.0.1-SNAPSHOT.jar"]
