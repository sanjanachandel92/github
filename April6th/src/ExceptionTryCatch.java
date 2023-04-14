import java.sql.SQLOutput;

public class ExceptionTryCatch {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3 ,4};

        try {
            System.out.println(arr[10]);
        }catch (Exception e){
            System.out.println("Exception occured");
        }
        System.out.println("Hey this is sanjh");
    }
}
