public class ArraySorted {
    public static void main(String[] args) {
        System.out.println("Array sorted");
        int[] arr = ArrayUtility.inputArray();
        boolean isSorted = isArraySortedAscending(arr) || isArraySortedDescending(arr);
        if(isSorted){
            System.out.println("Array is sorted");
        } else{
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isArraySortedAscending(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isArraySortedDescending(int[] arr){

        int i = 1;
        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
