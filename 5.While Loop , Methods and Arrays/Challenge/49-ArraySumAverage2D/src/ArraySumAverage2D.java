public class ArraySumAverage2D {
    public static void main(String[] args) {
        System.out.println("Sum and Average in 2D");
        int[][] arr = ArrayUtility.inputArray2D();
        long sum = sumArray2D(arr);
        double average = averageArray2D(arr);
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
    }
    public static long sumArray2D(int[][] arr){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }

        return sum;
    }

    public static double averageArray2D(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        int rows = arr.length;
        int columns = arr[0].length;
        double size = rows * columns;
        return  sumArray2D(arr) / size;
    }

}
