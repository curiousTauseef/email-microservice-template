FROM java:8-jre-alpine
MAINTAINER me

COPY target/email-microservice-template-0.0.1.jar /home/email-microservice-template-0.0.1.jar
CMD ["java","-jar","/home/email-microservice-template-0.0.1.jar"]
