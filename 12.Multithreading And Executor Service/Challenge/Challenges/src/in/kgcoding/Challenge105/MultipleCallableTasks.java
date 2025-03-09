package in.kgcoding.Challenge105;

import java.util.concurrent.Callable;

public class MultipleCallableTasks implements Callable<Integer> {

    private final int factorial;

    public MultipleCallableTasks(int factorial) {
        this.factorial = factorial;
    }

    @Override
    public Integer call() throws Exception {
        return factorial(factorial);
    }

//    @Override
//    public Integer call() throws Exception {
//         Thread.sleep(2000);
//         if( factorial <= 1 ){
//             return 1;
//         }
//         int result = 1;
//        for (int i = 2; i <= factorial; i++) {
//            result *= i;
//        }
//        return result;
//    }

    private Integer factorial(int n) throws  InterruptedException{
        if(n <= 1) {
            Thread.sleep(2000);
            return  1;
        } else {
            Thread.sleep(2000);
           return n * factorial(n - 1);
        }
    }
}
