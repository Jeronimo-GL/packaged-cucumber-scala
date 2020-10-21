FROM openjdk:11-stretch

CMD mkdir -f /opt/integration-tests

COPY target/scala-2.13/end-to-end-tests.jar /opt/integration-tests/