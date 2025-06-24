import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a 5-digit number
        System.out.print("Enter a 5-digit number: ");
        int num1 = scanner.nextInt();

        // Input a 6-digit number
        System.out.print("Enter a 6-digit number: ");
        int num2 = scanner.nextInt();

        // Add the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
