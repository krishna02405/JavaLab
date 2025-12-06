//basic interface implementation
interface Motor {
    int capacity = 100;
    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming electricity and water.");
    }

    public void checkCapacity() {
        System.out.println("The capacity of the motor is: " + Motor.capacity + " liters.");
    }
}
public class lab6_Q2 {
    public static void main(String[] args) {
        WashingMachine lg = new WashingMachine();

        lg.run();
        lg.consume();
        lg.checkCapacity();
    }
}