import java.util.Scanner;

public class ArrayOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Occurrences");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the search element: ");
        int num = scanner.nextInt();
        int occurrences = noOfOccurrences(arr, num);
        System.out.println(occurrences + " times " + num + " has occurred" );
    }

    public static int noOfOccurrences(int[] arr, int num){
        int occ = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
