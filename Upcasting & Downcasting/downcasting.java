class Animal
{
    public void eat()
    {
        System.out.println("Eating..");
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
        System.out.println("Bark..");
    }
}

public class downcasting {
    public static void main(String args[])
    {
        Animal a = new Dog();
        Dog d = (Dog)a;

        d.sleep();
        d.eat();
        d.bark();
        
        
    }
}
