import java.util.Scanner;

public class RightHalfPyramid3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Right Half Pyramid");
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        rightHalfPyramid(rows);
    }

    public static void rightHalfPyramid(int rows){
        int i = 1;
        while(i <= rows){
            int j = 1;
            while(j <= i){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
