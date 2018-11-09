name := "modeldb-client"

version := "0.1"

scalaVersion := "2.12.7"
//est in assembly := {}
//assemblyJarName in assembly := "modeldb-scala-client.jar"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.4.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.4.0" % "provided"

libraryDependencies ++= Seq(
    "org.apache.thrift" % "libthrift" % "0.10.0",
    "com.twitter" %% "scrooge-core" % "4.16.0" exclude("com.twitter", "libthrift"),
    "com.twitter" %% "finagle-thrift" % "6.44.0" exclude("com.twitter", "libthrift")
)
//// https://mvnrepository.com/artifact/com.twitter/finagle-thrift
//libraryDependencies += "com.twitter" %% "finagle-thrift" % "18.10.0"
//// https://mvnrepository.com/artifact/com.twitter/scrooge-core
//libraryDependencies += "com.twitter" %% "scrooge-core" % "18.10.0"
//// https://mvnrepository.com/artifact/com.github.scopt/scopt
//libraryDependencies += "com.github.scopt" %% "scopt" % "3.7.0"

//libraryDependencies += "org.apache.thrift" % "libthrift" % "0.9.3" exclude("org.slf4j", "slf4j-api")
//libraryDependencies += "com.twitter" %% "scrooge-core" % "4.12.0" exclude("com.twitter", "libthrift")
//libraryDependencies += "com.twitter" %% "finagle-thrift" % "6.36.0" exclude("com.twitter", "libthrift")
//
//libraryDependencies += "com.github.scopt" %% "scopt" % "3.5.0"
//
libraryDependencies += "io.spray" %%  "spray-json" % "1.3.5"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
parallelExecution in test := false


resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
assemblyMergeStrategy in assembly := {
    case PathList("javax", "servlet", xs @ _*)               => MergeStrategy.first
    case PathList(ps @ _*) if ps.last endsWith ".properties" => MergeStrategy.first
    case PathList(ps @ _*) if ps.last endsWith ".xml"        => MergeStrategy.first
    case PathList(ps @ _*) if ps.last endsWith ".types"      => MergeStrategy.first
    case PathList(ps @ _*) if ps.last endsWith ".class"      => MergeStrategy.first
    case PathList(ps @ _*) if ps.last endsWith ".json"       => MergeStrategy.last
    case PathList(ps @ _*) if ps.last endsWith ".provides"   => MergeStrategy.last
    case PathList(ps @ _*) if ps.last endsWith ".factories"  => MergeStrategy.last
    case "application.conf"                                  => MergeStrategy.concat
    case "unwanted.txt"                                      => MergeStrategy.discard
    case x =>
        val oldStrategy = (assemblyMergeStrategy in assembly).value
        oldStrategy(x)
}


resolvers += "Sonatype (releases)" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "Twitter" at "http://maven.twttr.com"
resolvers in Global ++= Seq(
    "Sbt plugins"                   at "https://dl.bintray.com/sbt/sbt-plugin-releases",
    "Maven Central Server"          at "http://repo1.maven.org/maven2",
    "TypeSafe Repository Releases"  at "http://repo.typesafe.com/typesafe/releases/",
    "TypeSafe Repository Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
)

resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"

resolvers += "geotools" at "http://download.osgeo.org/webdav/geotools"

resolvers += "maven" at "https://repo.maven.apache.org/maven2"

resolvers += "twitter" at "https://maven.twttr.com"

resolvers += "jnegre" at "https://bintray.com/artifact/download/jnegre/maven"

resolvers += "con-jars" at "http://conjars.org/repos"

resolvers += "clojars" at "http://clojars.org/repo"

resolvers ++= Seq(
    "apache-snapshots" at "http://repository.apache.org/snapshots/",
    "cdh.repo" at "https://repository.cloudera.com/artifactory/cloudera-repos",
    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    "ClouderaRepo" at "https://repository.cloudera.com/artifactory/cloudera-repos/",
    "Pentaho" at "http://repository.pentaho.org/artifactory/pentaho",
    "Thrift" at "http://people.apache.org/~rawson/repo/",
    "lessis" at "http://repo.lessis.me",
    "coda" at "http://repo.codahale.com",
    Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-relea"))(Resolver.ivyStylePatterns)
)