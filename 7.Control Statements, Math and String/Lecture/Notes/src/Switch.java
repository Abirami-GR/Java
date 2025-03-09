import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Week of the day");
        System.out.print("Enter the Day order in number: ");
        int day = scanner.nextInt();
        System.out.println("\nFall Through");
        fallThrough(day);
        System.out.println("\nOld Switch");
        oldSwitch(day);
        System.out.println("\nNew Switch");
        newSwitch(day);
    }

    public static void newSwitch(int day){
        String output = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
//            case 6 -> "Saturday";
//            case 7 -> "Sunday";
            default -> "Invalid Day";
        };
        System.out.println(output);
    }

    public static void fallThrough(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }

    public static void oldSwitch(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
