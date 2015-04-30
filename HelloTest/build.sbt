val mongoDb = "org.mongodb" %% "casbah"% "2.7.3"
val log = "ch.qos.logback" % "logback-classic" % "1.1.2"

lazy val commonSettings = Seq (
  organization := "yu.personal",
  version := "0.1.0",
  scalaVersion := "2.11.6"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "HelloTest",
    libraryDependencies += mongoDb,
    libraryDependencies += log
  )


