package in.kgcoding.Challenge85;

public class Calculator {

//    public int add(int a, int b){
//        return a + b;
//    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println("Calculator Overloading");
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,6));
        System.out.println(calculator.add(5, 6, 7));
        System.out.println(calculator.add(5.9,6.2));
    }
}
