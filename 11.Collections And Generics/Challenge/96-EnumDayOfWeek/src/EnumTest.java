public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
        //System.out.println(EnumDay.FRIDAY);
        for (EnumDayAttribute value : EnumDayAttribute.values()) {
            System.out.println(value);
        }
    }
}
