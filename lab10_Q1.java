import java.io.*;
import java.util.Scanner;

class lab10_Q1 {
    public static void main(String[] args ) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to display: ");
        String fileName = sc.nextLine();

        try {
            FileReader fr = new FileReader(fileName);
            int ch;
            System.out.println("File Content");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
