FROM evarga/jenkins-slave
MAINTAINER Fabian Schmidt

RUN apt-get update

RUN apt-get install -y git
RUN apt-get install -y openjdk-8-jdk
