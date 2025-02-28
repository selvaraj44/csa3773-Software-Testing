import java.util.Scanner;

public class program9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


        System.out.println("Date entered: " + day + "/" + month + "/" + year);
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
