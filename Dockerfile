FROM openjdk:17-jdk-alpine

RUN mkdir /app
WORKDIR /app
COPY target/market_company-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]