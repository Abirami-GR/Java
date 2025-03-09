package in.kgcoding.Challenge108;

import java.util.List;

public class StringFilter {
    public static void main(String[] args) {
        List<String> mathematics = List.of("Arithmetic", "Calculus",
                "Trigonometry", "Geometry", "Algebra", "Probability",
                "Number Theory", "Differential Equation", "Topology",
                "Combinatorics");
        String result = mathematics.stream()
                .filter(topic -> topic.length() > 10)
                .reduce("", (a , b) -> a + " " + b);

        System.out.println(result);
    }
}
