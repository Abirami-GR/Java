import java.util.Scanner;

public class ArraySearchElement2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search an element in 2D Array");
        int[][] arr = ArrayUtility.inputArray2D();
        System.out.print("Enter the element you want to search: ");
        int num = scanner.nextInt();
        boolean isElementFound = isFound2D(arr, num);
        if(isElementFound){
            System.out.println("The element is found");
        } else {
            System.out.println("The element is not found");
        }
    }

    public static boolean isFound2D(int[][] arr, int num){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                if(arr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }

        return false;
    }
}
