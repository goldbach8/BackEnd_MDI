FROM amazoncorretto:17
MAINTAINER MDI
COPY target/mdi-0.0.1-SNAPSHOT.jar mdi-app.jar
ENTRYPOINT ["java","-jar","/mdi-app.jar"]
