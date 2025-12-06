//Dynamic method dispatch
import java.util.Scanner;

class Bank {
    double ROI;

    void find_ROI() {
        this.ROI = 0.0;
        System.out.println("Generic Bank ROI: " + this.ROI);
    }
}

class HDFC extends Bank {

    void find_ROI() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last year's annual profit for HDFC (in Crores): ");
        double profit = sc.nextDouble();
        this.ROI = (profit / 1.5);
        System.out.println("HDFC Bank ROI: " + this.ROI);
    }
}

class ICICI extends Bank {

    void find_ROI() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fund supported by RBI for ICICI (in Crores): ");
        double fund = sc.nextDouble();
        this.ROI = (fund / 1.0);
        System.out.println("ICICI Bank ROI: " + this.ROI);
    }
}

public class lab6_Q4 {
    public static void main(String[] args) {
        Bank hdfcBank;
        Bank iciciBank;

        hdfcBank = new HDFC();
        iciciBank = new ICICI();

        System.out.println("->ROI of hdfc bank:---");
        hdfcBank.find_ROI();

        System.out.println("->ROI of icici bank:---");
        iciciBank.find_ROI();
    }
}