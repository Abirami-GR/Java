package in.kgcoding.Challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadedExecutor {
    public static void main(String[] args) {
        //Creating Executor
        try(ExecutorService executorService = Executors.newSingleThreadExecutor()){

            //Creating Tasks
            SingleThreadedExecutor task1 = new SingleThreadedExecutor('*');
            SingleThreadedExecutor task2 = new SingleThreadedExecutor('$');
            SingleThreadedExecutor task3 = new SingleThreadedExecutor('#');

            //Giving task to the executor
            executorService.submit(task1);
            executorService.submit(task2);
            executorService.submit(task3);
        }
        //executorService.shutdown();
    }
}
