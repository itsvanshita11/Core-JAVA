class Animal
{
    public void eat()
    {
        System.out.println("Eating...");
    }

    public void sleep()
    {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Barking...");
    }
}

public class inhertance 
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.bark();
    }    
}
