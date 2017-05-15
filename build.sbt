name := """first-play"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test


libraryDependencies ++= Seq(
  cache,
  jdbc,
  javaJdbc,
  ws,
  specs2 % Test,
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final",
  "org.xerial" % "sqlite-jdbc" % "3.8.10.1"
)



// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
