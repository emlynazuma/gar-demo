# for sbt
```bash
# before you begin, remember to replace artifact registry url in build.sbt

# folder structure
$ tree sbt
sbt
├── bin
│   └── sbt
├── build.sbt
├── example
│   └── Hello.scala
├── hello_2.11-1.1.2-SNAPSHOT.pom
└── project
    ├── build.properties
    └── plugin.sbt

# how to deploy
$ cd sbt
$ ./bin/sbt publish

```


# for mvn
```bash
# before you begin, remember to replace artifact registry url in pom.xml

# folder structure
$ tree mvn/
mvn/
├── pom.xml
└── src
    └── main

# how to deploy
$ cd mvn
$ mvn deploy
```

# differences between mvn & sbt
## behaviors when [deleting specific version](https://cloud.google.com/sdk/gcloud/reference/artifacts/versions/delete)
- mvn can delete specific version(both web UI & gcloud CLI)
- sbt cannot delete specific version(both web UI & gcloud CLI)
## pom file
- [mvn's pom](/mvn/pom.xml) & [sbt' pom](/sbt/hello_2.11-1.1.2-SNAPSHOT.pom)
- sbt lack of */project/distributionManagement* & */project/build/extensions* in pom
- */project/repositories/repository/id* is different
