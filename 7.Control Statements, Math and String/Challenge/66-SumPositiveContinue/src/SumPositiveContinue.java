public class SumPositiveContinue {
    public static void main(String[] args) {
        System.out.println("Sum Positive Numbers");
        int[] arr = ArrayUtility.inputArray();

        System.out.println("Sum is(While): " + sumPositiveContinue(arr));
        System.out.println("Sum is(For each): " + sumPositiveForEach(arr));
    }
    public static int sumPositiveContinue(int[] arr){
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] < 0){
                i++;
                continue;
            } else {
                sum += arr[i];
            }
            i++;
        }

        return sum;
    }

    public static int sumPositiveForEach(int[] arr){
        int sum = 0;

        for(int num : arr){
            if(num < 0){
                continue;
            }
            sum += num;
        }
        return sum;
    }
}
