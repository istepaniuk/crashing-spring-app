FROM amazoncorretto:16

COPY ./build/libs/crashing-spring-app-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080
ENTRYPOINT [ "java", "-Xverify:none", "-jar", "/app/app.jar" ]
