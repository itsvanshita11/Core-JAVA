class Animal
{
    public void eat()
    {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal 
{
    public void bark()
    {
        System.out.println("Dog barks");
    }

}


public class upcastingDowncasting 
{
    public static void main(String args[])
    {
        // upcasting

        // Animal a = new Dog();
        // a.eat();

        // Downcasting

        Animal a = new Dog();

        Dog d = (Dog) a;

        d.eat();
        d.bark();
        
    }    
}
