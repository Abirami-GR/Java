package in.kgcoding.Challenge99;

public class TestingHelloThread {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        t1.start();
        //t2.run();
        t2.start();

    }
}
