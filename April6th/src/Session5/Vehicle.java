package Session5;
//Compile time Polymorphism
public class Vehicle {
    public void soundHorn()
    {
        System.out.println("Sounding Horn");
    }
    public void soundHorn(int n)
    {
        System.out.println("Sounding horn "+n+" times");
    }
    public void soundHorn(int n, String str)
    {
        System.out.println("Sounding horn "+n+" times "+str);
    }
}
