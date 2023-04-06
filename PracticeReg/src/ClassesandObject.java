public class ClassesandObject {

    public static void main(String[] args)
    {
        Animal animal1 = new Animal();
        animal1.name = "Lion";
        animal1.legs = 4;

        System.out.println(animal1);

        Animal animal2 = new Animal();
        animal2.name = "Tiger";
        animal2.legs = 4;
    }
}
class Animal {
    public String name;
    public int legs;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}

