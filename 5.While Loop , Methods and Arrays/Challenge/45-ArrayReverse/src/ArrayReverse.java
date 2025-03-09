public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("Array Reverse");
        int[] arr = ArrayUtility.inputArray();
        int[] numArr = arrayReverse(arr);
        ArrayUtility.outputArray(numArr);
       // reverse(arr);
       // ArrayUtility.outputArray(arr);
    }

    public static int[] arrayReverse(int[] arr){
        int size = arr.length;
        int[] numArr = new int[size];
        int i = 0;
        while(i < size){
            numArr[i] = arr[(size -1) - i];
            i++;
        }
        return numArr;
    }

    public static void reverse(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
