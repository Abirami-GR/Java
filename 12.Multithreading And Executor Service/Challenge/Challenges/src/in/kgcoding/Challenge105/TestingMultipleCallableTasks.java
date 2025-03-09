package in.kgcoding.Challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingMultipleCallableTasks {
    public static void main(String[] args) throws ExecutionException,
            InterruptedException {

        //Executor Service
        try(ExecutorService executorService =
                    Executors.newFixedThreadPool(3)){

            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                MultipleCallableTasks task = new MultipleCallableTasks(i);
//                Future<Integer> value = executorService.submit(task);
                list.add(executorService.submit(task));
                //System.out.println(value.get());
            }

            for(Future<Integer> integerFuture: list){
                System.out.printf("\n Result is: %d", integerFuture.get());
            }

            //executorService.shutdown();

            if(!executorService.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("EMERGENCY SHUTDOWN!!!!");
                executorService.shutdownNow();
            }

        } catch (RuntimeException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
