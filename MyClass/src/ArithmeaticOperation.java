public class ArithmeaticOperation {
            public static void main(String args[])
        {

            System.out.println(sumOfTwoNumbers(2,3));
            System.out.println(diffOfTwoNumbers(2,3));
            System.out.println(prodOfTwoNumbers(2,3));
            System.out.println(quoOfTwoNumbers(8,2));
            System.out.println(remainderOfTwoNumbers(8,2));

        }

        public static int sumOfTwoNumbers(int a, int b)
        {

            return (a + b);
        }
        public static int diffOfTwoNumbers(int a, int b)
        {

            return (a - b);
        }

        public static int prodOfTwoNumbers(int a, int b)
        {

            return (a * b);
        }
        public static int quoOfTwoNumbers(int a, int b)
        {

            return (a / b);
        }
        public static int remainderOfTwoNumbers(int a, int b)
        {
            return (a % b);
        }

    }
