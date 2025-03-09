import java.util.Arrays;
import java.util.List;


public class ReverseListElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,76);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }

    public static void reverseList(List<Integer> list){
        //Collections.reverse(list) ;
        for(int i = 0; i < list.size() / 2; i++){
            SwapArrayListElements.swapElementsArraylist(list, i, list.size() -1 -i);
        }
    }
}
