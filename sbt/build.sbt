name := "hello-world"

// Avoid the default behavior which replace dots with hyphens
moduleName := name.value

version := "1.1.2-SNAPSHOT"

organization := "com.appier"

scalaVersion := "2.11.8"

publishMavenStyle := true

publishTo := Some("snapshots" at "{modify me}")
