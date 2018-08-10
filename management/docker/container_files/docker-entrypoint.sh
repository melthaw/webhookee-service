#!/bin/bash -e

# start service accordingly
JAR_VERSION=1.0.0-SNAPSHOT

echo "Using JAVA_OPTS=$JAVA_OPTS"
echo "CMD Args: $@"
echo "SLEEP 10 seconds ..."

sleep 10

echo "Webhookee Management is starting..."

java $JAVA_OPTS -jar "/webhookee-management-${JAR_VERSION}.jar" "$@"
