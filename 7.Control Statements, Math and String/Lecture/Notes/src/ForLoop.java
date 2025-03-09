public class ForLoop {
    public static void main(String[] args) {
        System.out.println("1 - 100");

        //While
        int i = 1;
        while(i <= 100){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //For
        for(int j = 1; j <= 100; j++){
            System.out.print(j + " ");
        }
    }
}
