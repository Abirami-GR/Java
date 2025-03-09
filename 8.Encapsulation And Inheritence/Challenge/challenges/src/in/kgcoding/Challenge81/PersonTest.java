package in.kgcoding.Challenge81;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Prashanth", 32);
        Person person2 = new Person("Prashanth", 32);

        if(person1.equals(person2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
