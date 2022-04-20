FROM openjdk:8
EXPOSE 8080
COPY target/spring-boot.jar spring-boot.jar
ENTRYPOINT ["java","-jar","/spring-boot.jar"]