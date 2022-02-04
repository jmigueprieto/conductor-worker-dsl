import static io.orkes.client.dsl.Worker.worker
import com.netflix.conductor.common.metadata.tasks.TaskResult

// miguel.prieto@toptal.com is the developer that coded this worker and keeps it up & running
worker {
    rootUri 'http://localhost:8080/api/'
    name 'close_tab_task'
    keyId '872ef6a6-bdc2-45ae-8be2-7b531ff7f9de'
    secret 'Pe2GE2Md7Ufge1OQhmCaTig0mzup5nV3E0YGoDHj20RY2GMh'
    start {
        println('Closed the tab at Bar X')
        TaskResult.complete()
    }
}