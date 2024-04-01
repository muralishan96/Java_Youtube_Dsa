package W3School;

public class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

/**
 * Pig extends Animal
 */
class Pig extends Animal {
    public void animalSound()
{
    System.out.println("the Pig says : wee wee");
}    
}

/**
 * Dog extends Animal
 */
class Dog extends Animal {

    public void animalSound(){
        System.out.println("The Dog sound: bow bow");
    }
}


class Main{
    public static void main(String[] args) {
        Animal ob1 = new Animal();
        Pig obj2 = new Pig();
        Dog obj3 = new Dog();
        ob1.animalSound();
         obj2.animalSound();
         obj3.animalSound();
    }
}