public class ArrayClass {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 10, 0, 5};

        // need to find the index of 10 in this array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index = " + i);
            if (arr[i] == 10) {
                System.out.println("number is = " + arr[i]);
                break;
            }
        }
    }
}
