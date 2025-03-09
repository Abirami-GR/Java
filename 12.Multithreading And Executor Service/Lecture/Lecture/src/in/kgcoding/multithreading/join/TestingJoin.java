
package in.kgcoding.multithreading.join;
import in.kgcoding.multithreading.runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');


        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n Thread 1 Started");

        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\n Thread 2 Started");

        t1.join(); //Main thread will wait (Because its from where join is called)
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\n Thread 3 Started");

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %dms", (endTime - startTime));
    }
}
