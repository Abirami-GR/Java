package in.kgcoding.Challenge111;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println("Optional String");
        System.out.printf("With value: %s\n", toOptional("Niklaus Mikaelson"));
        System.out.printf("Empty String: %s\n", toOptional(" "));
        System.out.printf("Null String: %s\n", toOptional(null));
    }

    public static Optional<String> toOptional(String name){
        if(name == null || name.isBlank()){
            return  Optional.empty();
        }
        return Optional.of(name.toUpperCase());
    }
}
