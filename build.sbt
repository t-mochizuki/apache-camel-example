lazy val baseSettings = Seq(
    version := "0.0.1",
    scalaVersion := "2.11.8",
    scalacOptions ++= Seq("-language:experimental.macros", "-deprecation", "-feature", "-language:higherKinds"),
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
  )
lazy val day1 = (project in file("day1")).
  settings(
    baseSettings,
    libraryDependencies ++= Seq(
      "org.apache.camel" % "camel-core" % "2.16.3",
      "org.apache.camel" % "camel-ftp" % "2.16.3"
    ),
    name := "day1"
  )

