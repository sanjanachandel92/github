public class CodingBAt {
    public static void main(String[] args) {
        System.out.println(doubleX("xaxxx") );
    }
    public static boolean doubleX(String str)
    {

        //int count=0;
        boolean res = true;
        String temp = "";
        int len = str.length();

        for(int i =0; i < (len-1) ; i++)
        {
            temp = str.substring(i,(i+2));
            System.out.println(temp);
            if (temp.equals("xx"))
            {
                res = true;
                break;
            }
            else
            {
                res = false;
            }

        }
        return res;
    }

}
