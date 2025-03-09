import java.util.Scanner;

public class LeftHalfPyramid3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Left Half Pyramid");
        System.out.print("Enter the no of rows: ");
        int rows = scanner.nextInt();
        leftHalfPyramid(rows);

    }
    public static void leftHalfPyramid(int rows){
        int i = 1;
        while(i <= rows){
            int j = 1;
            while(j <= rows){
                if(j >= ((rows + 1)-i)){
                    System.out.print(" *  ");
                } else{
                    System.out.print("    ");
                }

                j++;
            }
            System.out.println();
            i++;
        }
    }
}
