package io.orkes.client.samples;

import com.netflix.conductor.common.metadata.tasks.TaskResult;
import io.orkes.conductor.client.Workers;

public class ClientSamples {
    public static void main(String[] args) {
        Workers workers = new Workers();
        workers.rootUri("http://localhost:8080/api/")
                .register("simple_worker_1", (task -> {
                    System.out.println("Simple worker 1");
                    return TaskResult.complete();
                }))
                .register("simple_worker_2", (task -> {
                    System.out.println("Simple worker 2");
                    return TaskResult.complete();
                }))
                .startAll();
    }
}
