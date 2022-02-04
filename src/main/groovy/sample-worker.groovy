import static io.orkes.client.dsl.Worker.worker
import com.netflix.conductor.common.metadata.tasks.TaskResult

worker {
    rootUri 'http://localhost:8080/api/'
    name 'sample_worker'
    keyId '_CHANGE_ME_'
    secret '_CHANGE_ME_'
    start {
        println('Sample worker')
        TaskResult.complete()
    }
}
