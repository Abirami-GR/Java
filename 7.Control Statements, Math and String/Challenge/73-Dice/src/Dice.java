public class Dice {
    int roll(){
        double random = Math.random()* 6;
        //System.out.println(random);
        return (int) Math.ceil(random);
    }
    public static void main(String[] args) {
        //        int roll;
//        do{
//            System.out.println("Dice Rolling......");
//            double randomNumber = Math.random();
//            roll = (int) Math.round(randomNumber * 10);
//        }while(roll > 6 || roll < 1);
//        System.out.println("You rolled: " + roll);


        System.out.println("Game of Dice");
        Dice dice = new Dice();
        for(int i = 0; i < 10; i++){
            System.out.println("You Rolled: " + dice.roll());
        }
    }
}
