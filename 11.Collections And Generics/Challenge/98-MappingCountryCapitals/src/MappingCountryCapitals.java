import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MappingCountryCapitals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("Korea", "Seoul");
        countryMap.put("China", "Beijing");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Combodia", "Phnom Penh.");
        System.out.println("Welcome to Capital finder");
        System.out.print("Enter the country name: ");
        String country = scanner.next();

        if(countryMap.containsKey(country)){
            System.out.printf("The capital of %s is %s", country, countryMap.get(country));
        } else {
            System.out.println("Sorry! We don't know the capital");
        }
    }
}
