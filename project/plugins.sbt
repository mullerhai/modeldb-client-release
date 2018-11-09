logLevel := Level.Warn

resolvers += "twitter-repo" at "https://maven.twttr.com"
resolvers += Classpaths.sbtPluginReleases
resolvers += "twitter-repo" at "https://maven.twttr.com"
resolvers += "scrooge-sbt-plugin" at "https://bintray.com"
resolvers += "bintray" at "https://dl.bintray.com/twittercsl/sbt-plugins/"
resolvers += Resolver.url( "bintray-csl-sbt-plugins", url("https://dl.bintray.com/twittercsl/sbt-plugins"))( Resolver.ivyStylePatterns)
resolvers += "sonatype" at "https://oss.sonatype.org/content/groups/public"

resolvers ++= Seq(
    "twitter" at "http://maven.twttr.com",
    "sonatype" at "https://oss.sonatype.org/content/groups/public"
)

//addSbtPlugin("com.twitter" % "scrooge-sbt-plugin" % "4.12.0")
//addSbtPlugin("com.intenthq.sbt" % "sbt-thrift-plugin" % "1.0.5")

//i
// addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "3.16.3")
//addSbtPlugin("com.twitter" % "scrooge-sbt-plugin" % "4.16.0")
//addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")