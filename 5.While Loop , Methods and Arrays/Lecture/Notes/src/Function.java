public class Function {
    public static void main(String[] args) {
        System.out.println("In Main Method");
        greetUser();
        System.out.println("Out Main Method");
        greetUser();
        rightHalfPyramid();
        reverseRightHalfPyramid();
        leftHalfPyramid();
    }

    public static void greetUser(){
        System.out.println("Good Morning!");
    }

    public static void rightHalfPyramid() {
        System.out.println();
        System.out.println("Right Half Pyramid");
//        System.out.println("*");
//        System.out.println("*  *");
//        System.out.println("*  *  *");
//        System.out.println("*  *  *  *");
//        System.out.println("*  *  *  *  *");

        int i = 1;
        while(i <= 5){
            int j = 1;
            while(j <= i){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void reverseRightHalfPyramid (){
        System.out.println();
        System.out.println("Reverse Right Half Pyramid");
//        System.out.println("*  *  *  *  *");
//        System.out.println("*  *  *  *");
//        System.out.println("*  *  *");
//        System.out.println("*  *  ");
//        System.out.println("*");

        int i = 5;
        while(i >= 1){
            int j = 1;
            while(j <= i){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i--;
        }

    }

    public static void leftHalfPyramid() {
        System.out.println();
        System.out.println("Left Half Pyramid");
//        System.out.println("            *");
//        System.out.println("         *  *");
//        System.out.println("      *  *  *");
//        System.out.println("   *  *  *  *");
//        System.out.println("*  *  *  *  *");


        int i = 1;
        while(i <= 5){
            int j = 1;
            while(j <= 5 ){
               if(j >= (6-i)){
                   System.out.print(" * ");
               }else {
                   System.out.print("   ");
               }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
