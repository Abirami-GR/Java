package in.kgcoding.polymorphism;

public class TestFruits {
    public static void main(String[] args) {
        Mango mango = new Mango(3);
        Watermelon watermelon = new Watermelon();
        System.out.println(mango.getNoOfGroups());
        mango.plucked();
        System.out.println(watermelon.getNoOfGroups());
        watermelon.plucked();
    }
}
