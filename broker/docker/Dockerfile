########## How To Use Docker Image ###############
##
##  Image Name: melthaw/webhookee:broker
##  How To Build Docker Image: docker build --no-cache -f docker/Dockerfile -t melthaw/webhookee:broker --rm=true .
##  Docker hub link:
##  Description: This docker container is for the API gateway server.
##
##################################################
from clouthinkin/jre

LABEL maintainer "melthaw@gmail.com"

ADD build/libs/webhookee-broker-1.0.0-SNAPSHOT.jar /
ADD docker/container_files/ /

RUN chmod +x /*.sh

EXPOSE 80

WORKDIR /

ENTRYPOINT /docker-entrypoint.sh
