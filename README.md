# javafx-jpms-sample
This is a minimal project demonstrating how to set up a basic JavaFX "Hello World" application using the new JPMS system.

The project includes a Maven build configuration. If you run the "compile" and "install" tasks the build will place all
required jars (including dependencies) into the _deploy/lib_ directory. The included _run.bat_ file will start the
application on Windows. (It should also work on Linux, but I have not actually tested that.)

The _module-info.java_ file includes explanations for each of the module statements.