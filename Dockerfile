#FROM maven:3.5-jdk-8
#
#RUN mkdir -p /deploy/application
#
#VOLUME ["/deploy/application"]
#
#WORKDIR /deploy/application
#
#ADD  * .
#
#ENTRYPOINT ["mvn","clean","package"]

#FROM java:openjdk-8
#
#WORKDIR /deploy/application/target
#
#EXPOSE 8080
#
#ENTRYPOINT ["java","-jar","NewCrudApp.jar"]



FROM openjdk:8

ADD target/newcrudapp-spring-boot.jar newcrudapp-spring-boot.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "newcrudapp-spring-boot.jar"]