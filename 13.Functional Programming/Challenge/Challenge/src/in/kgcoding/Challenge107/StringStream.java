package in.kgcoding.Challenge107;

import java.util.List;
import java.util.function.Consumer;

public class StringStream {
    public static void main(String[] args) {
        List<String> names = List.of("Niklaus", "Elijah", "Kol", "Rebecca");


        //Consumer
        System.out.println("Consumer");
        names.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });
        System.out.println();

        //forEach
        System.out.println("ForEach");
        names.stream().forEach(name -> System.out.println(name));
    }
}
