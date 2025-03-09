public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Sum and Average of an Array");
        int[] arr = ArrayUtility.inputArray();
        int size = arr.length;
        long sum = sumOfArray(arr);
        double average = averageOfArray(sum, size);
        System.out.println("Sum is : " + sum + "\n Average is : " + average);
    }

    public static long sumOfArray(int[] arr ){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static double averageOfArray(long sum , int num ){
        return ((double) sum)/num;
    }
}
