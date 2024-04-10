FROM openjdk:17.0.2-slim-buster

WORKDIR /app

COPY /target/docker-lesson.jar /app

CMD ["java", "-jar", "/app/docker-lesson.jar"]