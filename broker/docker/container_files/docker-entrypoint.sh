#!/bin/bash -e

# start service accordingly
JAR_VERSION=1.0.0-SNAPSHOT

echo "Using JAVA_OPTS=$JAVA_OPTS"
echo "CMD Args: $@"

sleep 10

java $JAVA_OPTS -jar "/webhookee-broker-${JAR_VERSION}.jar" "$@"
