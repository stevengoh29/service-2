FROM registry.access.redhat.com/ubi9/openjdk-21:1.18-1

EXPOSE 8081

WORKDIR /app

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]