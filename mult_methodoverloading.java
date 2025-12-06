class Multiplication {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class mult_methodoverloading {
    public static void main(String[] args) {
        Multiplication m = new Multiplication();

        System.out.println("Multiply two ints: " + m.multiply(5, 4));
        System.out.println("Multiply three ints: " + m.multiply(2, 3, 4));
        System.out.println("Multiply two doubles: " + m.multiply(2.5, 3.5));
    }
}
