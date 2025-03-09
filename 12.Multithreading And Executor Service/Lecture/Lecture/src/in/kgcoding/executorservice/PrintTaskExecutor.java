package in.kgcoding.executorservice;

public class PrintTaskExecutor implements Runnable {

        @Override
        public void run() {
            //Print Task
            for (int i = 1; i <= 100; i++) {
               try {
                   Thread.sleep(30);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
                System.out.printf("%d%c ", i, targetChar);
            }
            System.out.printf("\n %s %c task completed", Thread.currentThread().getName(), targetChar);
        }

        private final char targetChar;

        public PrintTaskExecutor(char targetChar) {
            this.targetChar = targetChar;
        }
    }


