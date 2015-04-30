import sbtrelease.ReleasePlugin._
import sbt._
import Keys._

object MyBuild extends Build {
  lazy val HelloTest = Project(
    id = "HelloTest",
    base = file("."),
    settings = Defaults.defaultSettings ++ releaseSettings ++ Seq( /* custom settings here */ )
  )
}
