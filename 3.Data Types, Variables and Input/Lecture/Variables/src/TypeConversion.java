public class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5;
        float yourFloat = 5L;
        float ourFloat = (float)5d;
        int myInt = (int) 5.67f;
        System.out.println(myFloat );
        System.out.println(yourFloat);
        System.out.println(ourFloat);
        System.out.println(myInt);
    }
}
