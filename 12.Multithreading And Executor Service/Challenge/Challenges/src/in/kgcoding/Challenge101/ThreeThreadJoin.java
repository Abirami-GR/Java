package in.kgcoding.Challenge101;

public class ThreeThreadJoin implements Runnable {

    private  final int threadNumber;

    public ThreeThreadJoin(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread Starting-%d\n",
                Thread.currentThread().getName(), threadNumber);
      try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
        System.out.printf("%s Thread Ending-%d\n",
                Thread.currentThread().getName(), threadNumber);
    }
}
