public class StringFormat {
    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 45765;
        System.out.println("Hello " + name + ", Your mark is: " + marks);
        System.out.printf("Hello %S , Your mark is: %0,5d", name, marks);
    }

}
