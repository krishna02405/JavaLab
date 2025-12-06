import java.util.Scanner;

public class RepeatedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Repeated numbers are:");
        int c=0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    c=c+1;
                    break;
                }
            }
        }

        if (c==0) {
            System.out.println("No repeated numbers.");
        }

        sc.close();
    }
}
