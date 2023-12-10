#Base Docker Image
FROM openjdk:8
LABEL maintainer "vija-docker"
ADD target/boot-docker-0.0.1-SNAPSHOT.jar boot-docker.jar
ENTRYPOINT ["java", "-jar", "boot-docker.jar"]