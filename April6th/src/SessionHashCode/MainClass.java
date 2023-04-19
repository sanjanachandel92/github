package SessionHashCode;

public class MainClass {
    public static void main(String[] args){
        Employee e1 = new Employee(101, "Sanjana");
        Employee e2 = new Employee(101, "Sanjana");

        System.out.println(e1.hashcode());
        System.out.println(e2.hashcode());
        System.out.println(e1.equals(e2));

    }
}
