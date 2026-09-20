import java.util.Scanner;

public class Assignment1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first double value: ");

        if (!sc.hasNextDouble()) {
            System.out.println("First value is not a valid double.");
            return;
        }

        double num1 = sc.nextDouble();

        System.out.print("Enter second double value: ");

        if (!sc.hasNextDouble()) {
            System.out.println("Second value is not a valid double.");
            return;
        }

        double num2 = sc.nextDouble();

        double average = (num1 + num2) / 2;

        System.out.println("Average = " + average);

        sc.close();
    }
}