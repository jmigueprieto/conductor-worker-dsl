package io.orkes.client.dsl

import com.netflix.conductor.common.metadata.tasks.TaskResult
import io.orkes.conductor.client.Workers

class Worker {
    String rootUri
    String name
    String keyId
    String secret

    def static worker(closure) {
        Worker workerDsl = new Worker()
        closure.delegate = workerDsl
        closure()
    }

    def rootUri(String rootUri) {
        this.rootUri = rootUri
    }

    def name(String name) {
        this.name = name
    }

    def keyId(String keyId) {
        this.keyId = keyId;
    }

    def secret(String secret) {
        this.secret = secret;
    }

    def start(Closure<TaskResult> closure) {
        def workers = new Workers();
        workers.rootUri(rootUri)
                .keyId(keyId)
                .secret(secret)
                .start(name, closure)
    }
}
