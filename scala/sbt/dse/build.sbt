name := "writeRead"

version := "0.1"

scalaVersion := "2.10.6"

resolvers += "Local Maven Repository" at "file:///  <path to local repo>     /.m2/repository"
resolvers += "DataStax Repo" at "https://datastax.artifactoryonline.com/datastax/public-repos/"

// Please make sure that following DSE version matches your DSE cluster version.
libraryDependencies += "com.datastax.dse" % "dse-spark-dependencies" % "4.8.10-SNAPSHOT" % "provided"

//Your dependencies
//libraryDependencies += "com.github.scopt" %% "scopt" % "3.2.0"
