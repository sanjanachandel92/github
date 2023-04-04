import java.util.ArrayList;
import java.util.List;
public class ListExample {
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<String>();
        myList.add("Bhilai");
        myList.add("Raipur");
        myList.add("Jaipur");

        System.out.println(myList);

        List<Integer> myIntList = new ArrayList<Integer>();
        myIntList.add(1);
        myIntList.add(2);
        myIntList.add(3);

        System.out.println(myIntList);
    }
}
