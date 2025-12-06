public class lab7_Q2 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // causes NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
