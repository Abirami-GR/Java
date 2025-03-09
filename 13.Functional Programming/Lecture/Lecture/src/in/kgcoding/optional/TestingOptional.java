package in.kgcoding.optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
        //List<Integer> numbers = List.of();
        Optional<Integer> result = numbers.stream()
                .reduce((a,b) -> a + b);

        if(result.isPresent()){
            System.out.printf("The optional is: %d", result.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
