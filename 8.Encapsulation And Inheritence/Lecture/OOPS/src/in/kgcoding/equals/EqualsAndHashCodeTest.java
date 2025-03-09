package in.kgcoding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        //Person
        System.out.println("Person Object");
        Person person1 = new Person("Prashanth", 31, "001");
        Person person2 = new Person("Prashanth", 31, "001");

        //==
        if(person1 == person2){
            System.out.println("Equal");
        } else {
            System.out.println(" Not Equal");
        }

        //equals
        if(person1.equals(person2)){
            System.out.println("Equal");
        } else {
            System.out.println(" Not Equal");
        }


    }
}
