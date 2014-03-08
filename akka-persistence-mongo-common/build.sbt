import xerial.sbt.Sonatype._
import SonatypeKeys._

sonatypeSettings

organization := Common.Organization

profileName := Common.Organization

name := Common.NameCommon

scalaVersion := Common.ScalaVersion

version := Common.Version

parallelExecution in Test := Common.ParallelExecutionInTest

scalacOptions ++= Common.ScalaCOptions

pomExtra := Common.PomXtra

libraryDependencies ++= Seq(
  "ch.qos.logback"       % "logback-classic"                % "1.1.1"     % "compile",
  "commons-io"           % "commons-io"                     % "2.4"       % "test",
  "com.typesafe.akka"   %% "akka-testkit"                   % "2.3.0"     % "test",
  "com.typesafe.akka"   %% "akka-persistence-experimental"  % "2.3.0"     % "compile",
  "de.flapdoodle.embed"  % "de.flapdoodle.embed.mongo"      % "1.42"      % "test",
  "org.scalatest"       %% "scalatest"                      % "2.0"       % "test"
)
