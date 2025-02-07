import java.util.Scanner;

public class program3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the age of the user
        System.out.print("please Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You will vote after " + yearsLeft + " years.");
        }

        scanner.close();
    }
}