public class ArrayMaxMin {
    public static void main(String[] args) {
        System.out.println("Array Maximum and Minimum");
        int[] arr = ArrayUtility.inputArray();
        int max = arrayMax(arr);
        int min = arrayMin(arr);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }

    public static int arrayMax(int[] arr){
        if(arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while(i < arr.length){
            if(arr[i] > max){
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static int arrayMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i < arr.length){
            if(arr[i] < min){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}
