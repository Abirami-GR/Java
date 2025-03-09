import java.util.Scanner;

public class ArrayDeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Delete an element and return an new array");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the element you want to delete: ");
        int num = scanner.nextInt();
        int[] numArray = deleteArray(arr, num);
        ArrayUtility.outputArray(numArray);
    }

    public static int[] deleteArray(int[] arr, int num){
        int occ = ArrayOccurrences.noOfOccurrences(arr, num);
        if(occ == 0){
            return arr;
        }
        int size = arr.length - occ;
        int[] numArray = new int[size];

        int i = 0, j = 0;
        while(i < arr.length){
            if(arr[i] != num){
                numArray[j] = arr[i];
                j++;
            }
            i++;
        }


        return numArray;
    }

}
