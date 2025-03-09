package in.kgcoding.collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Prashanth"));
        System.out.println(names.add("Sanchit"));
        System.out.println(names.add("KGCoding"));
        Utility.print(names);

        System.out.println(names.add("Prashanth"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Prashanth"));
        System.out.println(names.remove("Prashanth"));
        Utility.print(names);
        System.out.println(names.remove("Prashanth"));

    }
}
