//Given a string str, print a string made up of last 2 chars
public class Last2char {
    public static void main(String[] args)
    {
        String str = "Sanjana";
        String res= str.substring(str.length()-2, str.length());
        System.out.println(res);

    }

}
