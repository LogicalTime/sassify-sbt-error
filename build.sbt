
scalaVersion in ThisBuild := "2.12.4"

lazy val rootproj = project.in(file("."))

lazy val server = (project in file("server"))
  .enablePlugins(SbtWeb)
  .settings(libraryDependencies ++=  Seq("org.webjars.npm" % "font-awesome" % "4.7.0"))
