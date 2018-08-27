########## How To Use Docker Image ###############
##
##  Image Name: picosio/webhookee:management
##  How To Build Docker Image: docker build --no-cache -f docker/Dockerfile -t picosio/webhookee:management --rm=true .
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
