FROM openjdk:12
MAINTAINER steinko
VOLUME /tmp
COPY build/libs/testtutorial1-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["java"]
CMD ["-jar", "/testtutorial1-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080