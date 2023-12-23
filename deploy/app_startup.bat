:: please modify your own env
set JAVA_HOME=D:\installers\jdk-21_windows-x64_bin\jdk-21.0.1
set CLASSPATH=.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools;
set Path=%JAVA_HOME%\bin;
java -jar demo-0.0.1-SNAPSHOT.jar
pause

