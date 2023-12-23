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