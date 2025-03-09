package in.kgcoding.Challenge113;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,2,5,3,4,6,2);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Numbers: " + numbers);
        System.out.println("Distinct Numbers: " + distinctNumbers);
    }
}
