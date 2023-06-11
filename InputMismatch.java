import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Numerator and Denominator");

        try {
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();
            System.out.println("Division Of Two Number=" + numerator / denominator);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Invalid input type");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid input");
        }


    }
}
