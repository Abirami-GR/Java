
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Custom Comparator
public class SortDescendingOrder {
    public static void main(String[] args) {
        List<String> list =  Arrays.asList("Bear", "Zebra","Buffalo", "Lion", "Ant");
        System.out.println("Before Sorting");
        System.out.println(list);
        System.out.println("After Sorting");
        sortInDescending(list);
        System.out.println(list);

    }

    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                } else if(o1.charAt(0) < o2.charAt(0)){
                   // return -1; Ascending
                    return 1;
                } else {
                   // return  1;  Ascending
                    return  -1;
                }
            }
        });
    }
}
