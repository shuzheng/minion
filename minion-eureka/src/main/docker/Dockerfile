FROM java:8
VOLUME /data
ADD minion-eureka-0.0.1.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]