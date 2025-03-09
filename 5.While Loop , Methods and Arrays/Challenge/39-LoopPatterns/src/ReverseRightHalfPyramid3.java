import java.util.Scanner;

public class ReverseRightHalfPyramid3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reverse Right Half Pyramid");
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        reverseRightHalfPyramid(rows);
    }

    public static void reverseRightHalfPyramid(int rows){
        int i = 1;
        while(i <= rows){
            int j = rows;
            while(j >= i){
                System.out.print("*  ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
