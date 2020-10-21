ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.loygorri"

lazy val hello = (project in file("."))
  .settings(
    name := "Tests with Cucumber",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.0",
      "io.cucumber" %% "cucumber-scala" % "6.8.1" ,
      "io.cucumber" % "cucumber-core" % "6.8.1",
      "io.cucumber" % "cucumber-jvm" % "6.8.1",
      "io.cucumber" % "cucumber-junit"  % "6.8.1",
      "com.novocode" % "junit-interface" % "0.11" 
    )
  )

assemblyJarName in assembly := "end-to-end-tests.jar"

mainClass in Compile := Some("io.cucumber.core.cli.Main") 