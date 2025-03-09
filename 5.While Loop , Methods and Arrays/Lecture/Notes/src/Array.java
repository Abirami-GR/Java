public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[1] = 2;
//        myArr[2] = 8;
//        myArr[3] = 65;
//        myArr[4] = 37;
        int[] myArr = {98, 2, 8, 65, 37};

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        //integer array
        int i = 0;
        while(i < myArr.length){
            System.out.println("Value at the position " + (i+1) + " is: " + myArr[i]);
            i++;
        }

        //string array
        String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);


    }
}
