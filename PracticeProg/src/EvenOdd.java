import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number you want to check:");
        int n = reader.nextInt();
        isEvenOdd(n);
    }
    public static void isEvenOdd(int n) {
        if ((n % 2) == 0)
        {
            System.out.println("The Entered no. is even !!");
        } else if ((n % 2) != 0)
        {
            System.out.println("The Entered no. is odd !!");
        } else
        {
            System.out.println("You've entered an invalid number !");
        }
    }
}