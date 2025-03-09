public class ArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("Array Palindrome");
        int[] arr = ArrayUtility.inputArray();
        //int[] reverse = ArrayReverse.arrayReverse(arr);
        //boolean isArrayPalindrome = isArrayPalindrome(arr, reverse);
        boolean isArrayPalindrome = isPalindrome(arr);
        if(isArrayPalindrome){
            System.out.println("Array is a Palindrome");
        } else{
            System.out.println("Array is not a Palindrome");
        }
    }

    public static boolean isArrayPalindrome(int[] arr, int[] reverse){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != reverse[i] ){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            if(arr[i] != arr[(arr.length -1) -i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
