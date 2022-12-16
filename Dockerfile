FROM openjdk:11

ARG APP_NAME="docker-jenkins-integrations-demo"
ARG APP_VERSION="0.0.1"
ADD target/${APP_NAME}-${APP_VERSION}-SNAPSHOT.jar ${APP_NAME}.jar
ENTRYPOINT ["java","-jar", "/docker-jenkins-integrations-demo.jar"]