name := "dfdl-csv"
 
organization := "com.owlcyberdefense"
 
version := "0.1.0-SNAPSHOT"
 
scalaVersion := "2.12.18"

// to test against IBM DFDL uncomment this line
// IBMDFDLCrossTesterPlugin.settings

useCoursier := false // needed for retrieveManaged to work.

retrieveManaged := true // populate lib_managed

enablePlugins(DaffodilPlugin)

daffodilFlatLayout := true
