name := "xwp-template"

organization := "com.earldouglas"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.1"

seq(webSettings :_*)

libraryDependencies += "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "container"

libraryDependencies += "org.eclipse.jetty" % "jetty-plus" % "7.4.5.v20110725" % "container"
 
libraryDependencies += "javax.servlet" % "servlet-api" % "2.5" % "provided"

env in Compile := Some(file(".") / "jetty-env.xml" asFile)
