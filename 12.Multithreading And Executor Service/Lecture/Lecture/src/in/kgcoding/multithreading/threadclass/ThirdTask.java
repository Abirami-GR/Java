package in.kgcoding.multithreading.threadclass;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        //Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n %s # task completed", Thread.currentThread().getName());
    }
}
