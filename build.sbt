val akkaVersion = "2.4.10"
val scalaTestVersion = "3.0.0"

lazy val base = (project in file("."))
  .enablePlugins(JavaServerAppPackaging, DockerPlugin)
  .settings(
    
    name := "WebAppBase",
    version := "1.0",
    scalaVersion := "2.11.8",
    
    resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/",
    libraryDependencies ++= Seq(
      "com.typesafe" % "config" % "1.3.0",
      "ch.qos.logback" %  "logback-classic" % "1.1.7",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.4.0",
      "com.typesafe.akka" %% "akka-actor" % akkaVersion,
      "com.typesafe.akka" %% "akka-http-core" % akkaVersion,
      "com.typesafe.akka" %% "akka-http-testkit" % akkaVersion,
      "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
      "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
      "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion,
      "com.typesafe.akka" %% "akka-http-jackson-experimental" % akkaVersion,
      "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaVersion,
      "com.typesafe.akka" %% "akka-http-xml-experimental" % akkaVersion,
      "com.typesafe.slick"%% "slick" % "3.1.1",
      "org.postgresql" % "postgresql" % "9.4.1208.jre7",
      "oauth.signpost" % "signpost-core" % "1.2",
      "org.scalactic" %% "scalactic" % "3.0.0",
      "org.scalatest" %% "scalatest" % scalaTestVersion % "test",
      "org.mockito" % "mockito-all" % "1.10.19" % "test",
      "org.openid4java" % "openid4java" % "1.0.0",
      "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
      "com.google.guava" % "guava" % "19.0"
    ),
    
    maintainer in Docker := "Emil Dafinov <emil.dafinov@gmail.com>"
  )
