########## How To Use Docker Image ###############
##
##  Image Name: picosio/webhookee:dashboard
##  How To Build Docker Image: docker build -f docker/Dockerfile --no-cache -t picosio/webhookee:dashboard --rm=true .
##
##################################################
#build stage
FROM clouthinkin/node as builder

RUN mkdir -p /webhookee

ARG BUILD_TYPE=build

ADD . /webhookee

RUN cd /webhookee && \
    ls && \
#    npm install && \
    npm run $BUILD_TYPE && \
# verify status
    test -f /webhookee/dist/index.html

# final stage
FROM clouthinkin/node

LABEL maintainer "melthaw@gmail.com"

RUN mkdir -p /usr/share/nginx/html

# Add docker entrypoint and healthcheck
COPY ./docker/container_files/docker-entrypoint.sh /
COPY --from=builder /webhookee/dist/ /usr/share/nginx/html/

RUN ls /usr/share/nginx/html/
RUN chmod +x /*.sh

WORKDIR /

ENTRYPOINT /docker-entrypoint.sh
