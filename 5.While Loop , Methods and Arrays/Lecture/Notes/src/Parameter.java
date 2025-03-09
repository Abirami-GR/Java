public class Parameter {
    public static void main(String[] args) {
//     int num = sumTwoNumbers(4,7);
//        System.out.println(num);
        System.out.println(sumTwoNumbers(4,7));
        System.out.println(sumTwoNumbers(5,9));
        System.out.println(sumTwoNumbers(-67,67));
    }
    public static int sumTwoNumbers(int first, int second){
        int sum = first + second;
        return sum;
    }
}
