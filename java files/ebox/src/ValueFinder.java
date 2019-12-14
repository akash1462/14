public class ValueFinder {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x++ > 10 && y++ > 10) {
            System.out.println("Condition passed");
        }
        System.out.println("Condition failed");
    }
}