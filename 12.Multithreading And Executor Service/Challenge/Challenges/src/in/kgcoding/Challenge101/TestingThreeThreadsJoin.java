package in.kgcoding.Challenge101;

public class TestingThreeThreadsJoin {
    public static void main(String[] args) {
        ThreeThreadJoin jt0 = new ThreeThreadJoin(0);
        ThreeThreadJoin jt1 = new ThreeThreadJoin(1);
        ThreeThreadJoin jt2 = new ThreeThreadJoin(2);

        Thread t0 = new Thread(jt0);
        Thread t1 = new Thread(jt1);
        Thread t2 = new Thread(jt2);

        try {
            //Thread 0
            t0.start();
            t0.join();

            //Thread 1
            t1.start();
            t1.join();


            //Thread 2
            t2.start();
            t2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
