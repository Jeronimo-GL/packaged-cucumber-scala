#!/bin/bash

DOCKER_IMAGE=integration-tests

docker run -ti -v $(pwd)/features:/opt/features \
    $DOCKER_IMAGE \
    java -jar /opt/integration-tests/end-to-end-tests.jar /opt/features/ --glue steps