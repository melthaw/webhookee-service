#!/bin/bash -e
cd ..
gradle clean build -x test
docker build -f docker/Dockerfile -t melthaw/webhookee:broker .
docker push melthaw/webhookee:broker