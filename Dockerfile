FROM evarga/jenkins-slave
MAINTAINER Fabian Schmidt

RUN apt update

RUN apt install -y git
