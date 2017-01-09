lazy val myLib = (project in file("my-lib"))

lazy val playJava = (project in file("play-java"))
  .enablePlugins(PlayJava)
  .dependsOn(myLib)

lazy val runnableApp = (project in file("runnable-app"))
  .dependsOn(myLib)
