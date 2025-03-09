package in.kgcoding.enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        //color = "RED";    --Error--
        color = TrafficLight.GREEN;


        //Grade grade = Grade.A;
        //Grade grade = Grade.X;  --Error--
        Grade grade = Grade.valueOf("D");
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }

    }
}
