public class LearningIfElse {
    public static void main(String[] args) {

        //Male or Female
        boolean isMale = true;
        String name = "Simon";

        System.out.println("Before If");
        if(isMale){
            System.out.println("Hello Mr." + name);
        } else {
            System.out.println("Hello Ms." + name);
        }
        System.out.println("After If");
        System.out.println();


        //Ticket
        boolean isSeniorCitizen = false;
        boolean isAnAdult = false;

        if(isSeniorCitizen){
            System.out.println("Hello! Senior Citizen");
        }
        else if(isAnAdult){
            System.out.println("Hello! Adult");
        }
        else {
            System.out.println("Hello! Child");
        }

    }
}
