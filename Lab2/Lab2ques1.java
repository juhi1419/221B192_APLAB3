// Animal.java
abstract class Animal {
    // Abstract method to be implemented by subclasses
    public abstract void makeVoice();
}

// Cow.java
class Cow extends Animal {
    public void makeVoice() {
        System.out.println("Moo");
    }
}

// Dog.java
class Dog extends Animal {
    public void makeVoice() {
        System.out.println("Woof");
    }
}

// Pig.java
class Pig extends Animal {
    public void makeVoice() {
        System.out.println("Oink");
    }
}

// Goat.java
class Goat extends Animal {
    public void makeVoice() {
        System.out.println("Baa");
    }
}

// Lion.java
class Lion extends Animal {
    public void makeVoice() {
        System.out.println("Roar");
    }
}

// Voice.java
class Voice {
    // Method to prepare the voice array with animals
    public void prepareVoice() {
        Animal[] animals = new Animal[5];
        
        // Create animal objects and assign them to the array
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
        // Call the hear method to display the voices
        hear(animals);
    }
    
    // Method to loop through the animals and call makeVoice
    public void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice(); // This will call makeVoice() on each animal object
        }
    }
}

// Test.java
public class Test {
    public static void main(String[] args) {
        // Create a Voice object and test the system
        Voice voice = new Voice();
        voice.prepareVoice();  // This will prepare and display the voices
    }
}
