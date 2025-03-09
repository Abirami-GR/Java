public class BreakAndContinue {
    public static void main(String[] args) {

        //While
        System.out.println("While");
        int i = 0;
        while(i < 10){
            i++;
            if(i == 3){
                continue;
            } else if(i == 8){
                break;
            }else {
                System.out.println(i);
            }
        }

        System.out.println();

        //For Break
        System.out.println("For Break");
        for(int j = 1; j < 1000; j++){
            if(j == 101){
                break;
            }
            System.out.println(j);
        }
        System.out.println("Out of Loop");


        //For continue
        System.out.println("For Continue");
        for(int k = 1; k < 10; k++){
            if(k == 5){
                continue;
            }
            System.out.println(k );
        }
        System.out.println("Out of Loop");
    }
}
