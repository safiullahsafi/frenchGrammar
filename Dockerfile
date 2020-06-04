FROM openjdk:8-jdk-alpine
VOLUME /rms-back
COPY bootstrap/target/rms-back.jar rms-back.jar
ENTRYPOINT ["java","-jar","rms-back.jar"]