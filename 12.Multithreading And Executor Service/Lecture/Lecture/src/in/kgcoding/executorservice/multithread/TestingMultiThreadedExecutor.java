package in.kgcoding.executorservice.multithread;
import in.kgcoding.executorservice.PrintTaskExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadedExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            PrintTaskExecutor task = new PrintTaskExecutor((char) i);
            executorService.submit(task);
        }
//        PrintTask task1 = new PrintTask('*');
//        PrintTask task2 = new PrintTask('$');
//        PrintTask task3 = new PrintTask('#');

//        executorService.submit(task1);
//        executorService.submit(task2);
//        executorService.submit(task3);


        executorService.shutdown();
        System.out.println("\n***************1"); //when main thread completes its
        //execution it will kill all the threads


            try{
                if(!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                    System.out.println("\n***************2");
                    executorService.shutdownNow();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


    }
}

