import java.util.Scanner;

public class lab7_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean success=false ;
        while (!success) {
            try {
                System.out.print("Enter numerator: ");
                num1 = sc.nextInt();
                System.out.print("Enter denominator: ");
                num2 = sc.nextInt();

                int result = num1 / num2;
                System.out.println("Result = " + result);
                success = true;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero! Try again.");
            } finally {
                if (!success)
                    System.out.println("You have another chance to enter numbers.\n");
            }
        }

        sc.close();
    }
}
