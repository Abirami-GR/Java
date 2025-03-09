public class ForEach {
    public static void main(String[] args) {
        String[] names = new String[]{
          "Ram",
          "Shyam",
          "Mohan",
          "Geeta",
          "Sita",
          "Sohan"
        };
        printArrayFor(names);
        System.out.println();
        printArrayForEach(names);
    }

    public static void printArrayFor(String[] names){
        //For
        System.out.println("For Loop");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }


    public static void printArrayForEach(String[] names){
        //For Each
        System.out.println("For Each Loop");
        for(String name : names) {
            System.out.println(name);
        }
    }
}
