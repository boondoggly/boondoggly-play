name := "boondoggly"
description := "Boondoggly is a place, where you can waste your free time on free projects for other peoples."

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  filters,
  "org.sangria-graphql" %% "sangria" % "1.0.0-RC4",
  "org.sangria-graphql" %% "sangria-play-json" % "0.3.3",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)
