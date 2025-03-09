import java.util.Scanner;

public class ForEachOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("No Of Occurrences");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("The number occurred " + forEachOccurrences(arr, num) + " Times");
    }
    public static int forEachOccurrences(int[] arr, int num){
        int occ = 0;
        for(int occNum : arr){
            if(num == occNum){
                occ++;
            }
        }
        return occ;
    }
}
