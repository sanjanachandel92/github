import java.util.scanner;
public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("--------CALCULATOR--------");
        System.out.println("Which operation you want to perform:");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        Scanner reader = new Scanner(System.in);
        int option = reader.nextInt();

        System.out.println("Enter the first number:");
        int n1 = input.nextInt();
        System.out.println("Enter the second number:");
        int n2 = input.nextInt();
        int result;

        switch(option)
        {
            Case '1':
            result = n1 + n2;
            System.out.println("Addition of an entered no. is ", +result);
            break;
            Case '2':
            result = n1 - n2;
            System.out.println("Subtraction of an entered no. is ", +result);
            break;
            Case '3':
            result = n1 *  n2;
            System.out.println("Multiplication of an entered no. is ", +result);
            break;
            Case '4':
            result = n1 / n2;
            System.out.println("Division of an entered no. is ", +result);
            break;

            default:
                System.out.println("You have entered an invalid option!");
                break;

        }

    input.close();
    }

}
