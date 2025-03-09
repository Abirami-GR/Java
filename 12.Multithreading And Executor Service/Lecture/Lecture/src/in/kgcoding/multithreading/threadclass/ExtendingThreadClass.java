package in.kgcoding.multithreading.threadclass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\n Starting First Thread");
        t1.start();
        System.out.println("\n Starting Second Thread");
        t2.start();
        System.out.println("\n Starting Third Thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %dms", (endTime - startTime));
    }
}
