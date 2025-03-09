package in.kgcoding.executorservice.returningfutures;

import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException,
            InterruptedException {

        // Promises in java
        //Executor Service
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        //Creating Task
        FetchName task1 = new FetchName("Niklaus");
        FetchName task2 = new FetchName("Elijah");
        FetchName task3 = new FetchName("Kol");
        FetchName task4 = new FetchName("Rebecca");

        //Submitting task to the executor service
        Future<String> name1 =  executorService.submit(task1);
        Future<String> name2 =  executorService.submit(task2);
        Future<String> name3 =  executorService.submit(task3);
        Future<String> name4 =  executorService.submit(task4);

        //The main method will stop here until the name is fetched
        System.out.println("Full Name: " + name1.get());
        System.out.println("Full Name: " + name2.get());
        System.out.println("Full Name: " + name3.get());
        System.out.println("Full Name: " + name4.get());

        executorService.shutdown();
    }
}
