public class SumOfTwoDiagonals {
    public static void main(String[] args) {
        System.out.println("Sum of Two diagonals");
        int[][] arr = ArrayUtility.inputArray2D();
        long sum = sumOfDiagonals(arr);
        System.out.println("Sum of the diagonals is : " + sum);
    }
    public static long sumOfDiagonals(int[][] arr){
        long leftSum = sumOfLeftDiagonals(arr);
        long rightSum = sumOfRightDiagonals(arr);
        long sum = leftSum + rightSum;
        if(arr.length % 2 != 0){
           int ind = arr.length / 2;
           sum -= arr[ind][ind];
        }
        return  sum;
    }

    public static long sumOfLeftDiagonals(int[][] arr){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i][i];
            i++;
        }
        return  sum;
    }

    public static long sumOfRightDiagonals(int[][] arr){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            int j = arr.length - 1 - i;
            sum += arr[i][j];
            i++;
        }
        return  sum;
    }
}
