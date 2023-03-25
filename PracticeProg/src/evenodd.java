public class evenodd {

    public static void main(String[] args)
    {

        isEvenOdd(7);

    }

}

    public static void isEvenOdd(int n)
    {
        if ((n % 2) == 0)
        {
            System.out.println("The Entered no. is even !!");
        }
        else if ((n % 2) != 0)
        {
            System.out.println("The Entered no. is odd !!");
        }
        else
        {
            System.out.println("You've entered an invalid number !");
        }
    }