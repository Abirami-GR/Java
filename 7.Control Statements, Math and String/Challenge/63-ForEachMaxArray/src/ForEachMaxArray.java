public class ForEachMaxArray {
    public static void main(String[] args) {
        System.out.println("Maximum value in an array");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("The maximum number is: " + forEachMaximum(arr));
    }

    public static int forEachMaximum(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = arr[0];
        for(int num : arr){
            if(max < num){
                max = num;
            }
        }
        return max;
    }
}
