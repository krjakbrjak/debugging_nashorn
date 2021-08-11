# Debugging nashorn apps

It is important to be able to debug [nashorn](https://www.oracle.com/technical-resources/articles/java/jf14-nashorn.html) scripts. Unfortunately, it seems that the majority of the modern IDEs ([IDEA](https://www.jetbrains.com/idea/), [VSCode](https://code.visualstudio.com/), etc.) has no out-of-the-box support for that. Only [Netbeans](https://netbeans.apache.org/) can do that without requiring any extra steps.

This project is a sample project that describes how to debug nashorn scrpits in the java application.

## Build
```shell
./gradlew assemble
```

## Docker
To start [tomcat](http://tomcat.apache.org/) container, run:
```shell
docker-compose -f docker/docker-compose.yaml up --build
```
This command will build and start the tomcat container in a `debug`-mode. Then, visit [http://localhost:8080](http://localhost:8080) and upload built `war` file (it should be under build/libs/).

## Debugging JS scripts
See [this page](https://blogs.oracle.com/sundararajan/remote-debugging-of-nashorn-scripts-with-netbeans-ide-using-debugger-statements) for more information how to set break points inside nashorn scripts.