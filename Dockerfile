FROM openjdk:17-alpine

COPY target/json-converter-0.0.1-SNAPSHOT.jar json-converter-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/json-converter-0.0.1-SNAPSHOT.jar"]