public class EnumTestAttribute {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
        //System.out.println(EnumDay.FRIDAY);
        for (EnumDayAttribute value : EnumDayAttribute.values()) {
            System.out.printf("%s : %s\n", value, value.getType());
        }
    }
}
