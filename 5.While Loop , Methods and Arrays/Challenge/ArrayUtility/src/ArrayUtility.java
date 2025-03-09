import java.util.Scanner;


public class ArrayUtility {
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No of Elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element no " + (i+1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        return  arr;
    }

    public static void outputArray(int[] arr) {
        System.out.println("Elements of the array are: ");
        int i = 0;
        while(i < arr.length){
            System.out.println("Enter element no " + (i+1) + " : " + arr[i]);
            i++;
        }

    }

    public static int[][] inputArray2D() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No of rows: ");
        int rows = scanner.nextInt();
        System.out.print("No of columns: ");
        int columns = scanner.nextInt();
        int[][] arr = new int[rows][columns];
        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < columns){
                System.out.print("Row & Column [" + (i+1) + "][" + (j+1) +  "] : ");
                arr[i][j] = scanner.nextInt();
                j++;
            }

            i++;
        }
        return  arr;
    }

    public static void outputArray2D(int[][] arr) {
        System.out.println("Elements of the array are: ");
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                System.out.println("Row & Column [" + (i+1) + "][" + (j+1) +  "] : " + arr[i][j]);
                j++;
            }
            i++;
        }

    }
}
