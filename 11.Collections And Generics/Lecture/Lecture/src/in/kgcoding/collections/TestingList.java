package in.kgcoding.collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Prashanth");
        strList.add("Jain");
        strList.add(1,"Pradeep");
        //strList.add(54);
        strList.remove(0);

        if(strList.contains("Jain")){
            System.out.println(strList.indexOf("Jain"));
        }


        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " ");
        }

        //System.out.println(strList.get(0));


        for (String str : strList){
            System.out.println(str);
        }
    }
}
