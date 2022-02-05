# Groovy Client DSL

This project provides a DSL inspired in Gradle and Jenkins Pipelines to write Conductor clients.

Here's a sample worker:

```groovy
@Grab("io.orkes.conductor:groovy-dsl-client:1.0-SNAPSHOT")
import static io.orkes.client.dsl.Worker.worker
import com.netflix.conductor.common.metadata.tasks.TaskResult

worker {
    rootUri 'http://localhost:8080/api/'
    name 'hello_world_worker'
    keyId '_CHANGE_ME_' // Create an Application and Access Key on Conductor UI
    secret '_CHANGE_ME_'
    start {
        println('Hello World!')
        TaskResult.complete()
    }
}
```

To run this worker (assuming you have Groovy 3.0.x installed) you can execute:

```bash
groovy hello-world-worker.groovy
```

**NOTES**

This artifact is not yet published in any repository, so you need to publish it to your local maven repo.

1. This project depends on `orkes-client-client` which is not published to any repository either. In `orkes-conductor` project run:

```bash
./gradlew -p client publishToMavenLocal
```

2. In this project run:
```bash
 ./gradlew publishToMavenLocal
```

**TODO**
- Review Gradle setup/dependency management. 
