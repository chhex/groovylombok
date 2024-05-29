Two scenarios

* Java Lombok annotated Classes consumed from Groovy, see https://github.com/chhex/groovylombok/blob/main/src/test/groovy/ch/chesnb/beans/lombok/GroovyLombokTests.groovy
* Groovy Lombok annotated Class.

The first works without problems
The second -> The Lombok Annotations are ignored by Groovy. The Test Here the Test "Groovy class with Lombok annotation doesn't work" fails with

```
GroovyLombokTests > Groovy class with Lombok annotation doesn't work FAILED
    groovy.lang.MissingMethodException: No signature of method: static ch.chesnb.beans.lombok.TestE.builder() is applicable for argument types: () values: []
    Possible solutions: find()
        at ch.chesnb.beans.lombok.GroovyLombokTests.Groovy class with Lombok annotation doesn't work(GroovyLombokTests.groovy:64)
```

Enviroment:

```
$ ./gradlew -versionGradle 7.3.3Build time:   2021-12-22 12:37:54 UTC
Revision:     6f556c80f945dc54b50e0be633da6c62dbe8dc71Kotlin:       1.5.31
Groovy:       3.0.9
Ant:          Apache Ant(TM) version 1.10.11 compiled on July 10 2021
JVM:          17.0.3 (Eclipse Adoptium 17.0.3+7)
OS:           Mac OS X 13.2.1 aarch64
```
