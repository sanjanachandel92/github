public class SomeClass {
    public static void main(String[] args) {

        System.out.println(getProduct(3, 4));
        System.out.println(canFly(true));
        System.out.println(canFly(false));
    }
    public static int getProduct(int a, int b) {
        return a * b;
    }

    public static boolean canFly(boolean haswings) {
        if (haswings == true) {
            return true;
        } else {
            return false;
        }
    }
}