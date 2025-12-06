import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class lab7_Q4 {
    int number;

    void processInput() throws NegativeNumberException {
        if (number < 0) {
            // Throw custom exception
            throw new NegativeNumberException("Negative number entered: " + number);
        }
        else {
            int sum = 0, temp = number;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            System.out.println("Sum of digits of " + number + " = " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lab7_Q4 obj = new lab7_Q4();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        try {
            obj.processInput(); // call method that may throw exception
        } catch (NegativeNumberException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        sc.close();
    }
}
