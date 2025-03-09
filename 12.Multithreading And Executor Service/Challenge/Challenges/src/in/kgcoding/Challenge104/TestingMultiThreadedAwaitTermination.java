package in.kgcoding.Challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadedAwaitTermination {
    public static void main(String[] args) {
        try(ExecutorService executorService =
                    Executors.newFixedThreadPool(5)){

            for (int i = 0; i < 10; i++) {
                MultiThreadedAwaitTermination task = new
                        MultiThreadedAwaitTermination((char)i);
                executorService.submit(task);
            }

            executorService.shutdown();
            if(!executorService.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("EMERGENCY SHUTDOWN!!!");
                executorService.shutdownNow();
            }
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }


    }
}
