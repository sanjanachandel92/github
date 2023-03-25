public class Array {

    public static void main(String[] args)
    {
        String str = "Hyderabad Bangalore";
       // String str2 = str.substring(3,6);
        // System.out.println(str.substring(3));
       // System.out.println(str.charAt(3));
        System.out.println(str.substring(3,13));

        String[] strArr = {"This", "is", "Sanjh"};
        char[] charArr = {'a','b','c'};
        boolean[] boolArr = {true, false, true, true};
        double[] dArr = {0.3, 0.7, 0.88};

        String someStr = "Hyd";
        System.out.println(someStr + someStr); //StringConcatenation

        int[] a = {11, 22, 44, 65, 88, 96 , 77};
        int length = a.length;
        System.out.println("Array length is :" +length);
        //System.out.println(a);

        for(int i=0; i<a.length; i++)
        {
            if (a[i] % 2 == 1) {
                System.out.println(a[i]);
            }

        }
    }
}
