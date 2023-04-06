public class Coding
{

    public static void main()
    {
        System.out.println(front3("Java"));
    }
    public String front3(String str)
    {
        String temp = "";
        String res = "";

        if (str.length() > 3)
        {
            temp = str.substring(0,4);
            res = temp+temp+temp;

        }
  else if (str.length() < 3)
        {
            res = str+str+str;

        }
        return res;
    }

}
