FROM gradle:7.1-jdk16 AS BUILD_IMAGE

WORKDIR /builder
COPY . .
RUN gradle --no-daemon clean build

FROM amazoncorretto:16

COPY --from=BUILD_IMAGE /builder/build/libs/crashing-spring-app-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app/app.jar" ]
