# Simplest end to end tests using cucumber and scala

## Goal

Show the bare minimum needed to create a end to end test framework using cucumber in scala. The goal is to separate the tasks of writing tests in [gherkin](https://cucumber.io/docs/gherkin/) and teh task fo writing the steps to implement them in scala.

At the end a jar file is created that can run tests defined outside the jar file using the steps that are included in the jarfile.

## Usage

This project illustrates the setup needed.

The code for the steps is in `/src/main/scala/steps`. When the jar file is created using `sbt assembly` we can run the following command to execute the tests located in the `features` directory.

``` bash
java -jar target/scala-2.13/end-to-end-tests.jar features --glue steps
```

This way a team can write the tests in gherkin and other can write the steps in scala independently.

### Configuration

The command line options are the ones passed to the cucumber cli. in the example above we pass the path to the features `features` and the path to the classes with the steps in the `glue` parameter.

## Running as a container

A docker container can be created to run the integration tests inside it. Create the container with the following commands.

First we need to buid the image that contains the steps and all the libraries.

``` bash
sbt assembly
```

The we create the image.

``` bash
docker build -t integration-tests .
```

It creates a new image named `integration-tests`.

Once the image is created the tests can be run using the `integration-tests.sh` script. It executes the integration tests in the features directory.

## Contribute

Feel free to use it. Any contributions are welcome.
