package in.kgcoding.Challenge110;

public class LambdaPrimeNumber {
    public static void main(String[] args) {
        PrimeOrNot primeOrNot = num -> {
            for (int i = 2; i < num; i++) {
                 if(num % i == 0){
                     return  false;
                 }
            }
            return true;
        };

        System.out.println(primeOrNot.isPrime(5));
        System.out.println(primeOrNot.isPrime(12));
        System.out.println(primeOrNot.isPrime(2));
    }
}
