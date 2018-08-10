########## How To Use Docker Image ###############
##
##  Image Name: melthaw/webhookee:management
##  How To Build Docker Image: docker build --no-cache -f docker/Dockerfile -t melthaw/webhookee:management --rm=true .
##  Docker hub link:
##  Description: This docker container is for the webhooke management
##
##################################################
from clouthinkin/jre

LABEL maintainer "melthaw@gmail.com"

ADD build/libs/webhookee-management-1.0.0-SNAPSHOT.jar /
ADD docker/container_files/ /

RUN chmod +x /*.sh

EXPOSE 80

WORKDIR /

ENTRYPOINT /docker-entrypoint.sh
