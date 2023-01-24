class Zebra extends Animal
{
    public boolean is_wild = true;

    public void run()
    {
        System.out.println("This is a public method run() from class Zebra.");
    }
}


class Fish extends Animal
{
    private int sizeInFeet = 2;

    private void canEat()
    {
        System.out.println("This is a private method canEat() from class Fish.");
    }
}


public class Animal 
{
    public int age = 5;

    public String gender = "Male";

    public void isMammal()
    {
        System.out.println("This is a public method isMammal() from class Animal.");
    }

    public void mate()
    {
        System.out.println("This is a public method mate() from class Animal.");
    }

    public static void main(String[] args)
    {
        // Creating objects for Animal, Zebra and Fish.
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        // Calling public members of Animal and Zebra classes.
        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();
    }
}
