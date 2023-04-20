FROM openjdk:17
EXPOSE 8080
ADD target/Currency-docker.jar Currency-docker.jar
ENTRYPOINT ["java","-jar","/Currency-docker.jar"]