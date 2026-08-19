class Animal
{
    public void sound()
    {

    }
}

class Dog extends Animal
{
    public void sound()
    {
        System.out.println("Bark..");
    }
}

class Cat extends Animal
{
    public void sound()
    {
        System.out.println("Meow...");
    }
}

class Cow extends Animal
{
    public void sound()
    {
        System.out.println("Moo..");
    }
}


public class animalSounds {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        Cat c = new Cat();
        Cow cw = new Cow();

        d.sound();
        c.sound();
        cw.sound();
    }
}
