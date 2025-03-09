package in.kgcoding.lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda tl = new TestingLambda();
        int sum = tl.sum(5,7);
        tl.printString("This is the best java course");

//         toPrint -> System.out.println(toPrint);
//         (a,b) -> a + b;
//         (a, b) -> {
//             int sum = a + b;
//             System.out.println(sum);
//         }
    }

    private void printString(String toPrint){
        System.out.println(toPrint);
    }

    private int sum(int a, int b){
        int sum = a + b;
        return  sum;
    }
}
