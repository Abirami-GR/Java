import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armstrong Number");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        boolean isArmstrong = isArmstrongNumber(num);

        if(isArmstrong){
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }

    }

    public static boolean isArmstrongNumber(int num){
        int realNum = num;
        int power = noOfDigits(num);
        int sum = 0;
        int i = 1;
        while(i <= power){
          int mod = num % 10;
          num /= 10;
          sum += calculatePower(mod,power);
            i++;
        }

        if(sum == realNum){
            return true;
        } else{
            return false;
        }
        //return sum == realNum;

    }

    public static int noOfDigits(int num){
        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }

        //System.out.println(count);
        return count;
    }

    public static int calculatePower(int mod, int power){
        int i = 1;
        int sum = 1;
        while(i <= power){
            sum *= mod;
            i++;
        }
        //System.out.println(sum);
        return sum;
    }


}
