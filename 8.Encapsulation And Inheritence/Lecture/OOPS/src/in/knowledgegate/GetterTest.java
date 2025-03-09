package in.knowledgegate;

import in.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "Maruthi", 3, 8000);
        car.setColor("Yellow");
        System.out.printf("%s %s",car.getColor() , car.getModel());



    }
}
