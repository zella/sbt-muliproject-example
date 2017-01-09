name := """runnable-app"""

version := "1.0"

scalaVersion := "2.11.7"

mainClass in assembly := Some("com.example.Hello")

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

libraryDependencies ++= Seq(
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test"
)
