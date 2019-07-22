FROM maven:3.5-jdk-8

RUN mkdir -p /deploy/application

VOLUME ["/deploy/application"]

WORKDIR /deploy/application

ADD src .

ENTRYPOINT ["mvn","clean","package"]