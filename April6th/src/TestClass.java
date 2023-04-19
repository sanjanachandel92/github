public class TestClass {
    public static void main(String[] args)
    {
        int arr[] = {3,5,2,8,6,1,33,72, 81};

         for(int i=0; i<arr.length ;i++)
            {
                if(arr[i]%2 !=0)
                {
                    System.out.println(arr[i]);
                }
            }
            //System.out.println("Odd elements in the array are:", +arr);

    }
}
