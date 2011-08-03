// set the name of the project
name := "scala-benchmarking-template"

organization := "com.example"

version := "1.0.0-SNAPSHOT"

// set the Scala version used for the project
scalaVersion := "2.9.1.RC1"

// Execute tests in the current project serially
//   Tests from other projects may still run concurrently.
parallelExecution in Test := false

logLevel := Level.Info

// only show 10 lines of stack traces
traceLevel := 10

// add compile dependencies on a some dispatch modules
libraryDependencies ++= {
    Seq(
        "com.google.code.java-allocation-instrumenter" % "java-allocation-instrumenter" % "2.0",
        "com.google.code.caliper" % "caliper" % "1.0-SNAPSHOT",
        "com.google.code.gson" % "gson" % "1.7.1"
    )
}

// add a sequence of maven-style repositories
resolvers ++= Seq(
  "sonatypeSnapshots" at "http://oss.sonatype.org/content/repositories/snapshots"
)

// disable updating dynamic revisions (including -SNAPSHOT versions)
offline := true

// enable forking in run
fork in run := true
