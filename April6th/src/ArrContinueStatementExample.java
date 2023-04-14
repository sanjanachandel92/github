public class ArrContinueStatementExample {
    public static void main(String[] args){
        int[] arr = {12, 3, 7, 10, 55, 33, 66};

        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]==10)
            {
                continue;
            }
            System.out.println("index="+i);
        }
    }
}
