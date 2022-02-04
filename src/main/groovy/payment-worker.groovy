import static io.orkes.client.dsl.Worker.worker
import com.netflix.conductor.common.metadata.tasks.TaskResult

// jmpr.py@gmail.com is the developer that coded this worker and keeps it up & running
worker {
    rootUri 'http://localhost:8080/api/'
    name 'payment_task'
    keyId '514e9a10-1234-44ad-bd3c-8eb73d8d7501'
    secret 'b6TGxdUcFAsedq7nDsWggmIpOJJfXSsC744TrTiNNyB5XHTz'
    start {
        println('Processed payment with Braintree')
        TaskResult.complete()
    }
}