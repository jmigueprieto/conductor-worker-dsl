# Groovy Client DSL

This project provides a DSL inspired in Gradle and Jenkins pipelines to writer Conductor clients.

For example, this is how you would write a worker:

```groovy
worker {
    rootUri 'http://localhost:8080/api/'
    name 'sample_worker'
    start {
        println('Sample worker')
        TaskResult.complete()
    }
}
```


**TODO**
- Review Gradle setup/dependency management. A developer should be able to just do `@Grab('io.orkes.conductor:groovy-dsl:0.0.1')` and run `groovy worker.groovy`.
