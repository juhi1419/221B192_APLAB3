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

// Voice2.java - Template Method Class
class Voice2 {
    // Template method to ensure the correct order of procedures
    public void templateMethod() {
        prepareVoice(); // Step 1: Prepare the animals
        hear();          // Step 2: Hear the animals' voices
    }

    // Prepare the voice (this is step 1 in the template method)
    private void prepareVoice() {
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
    
    // Method to loop through the animals and call makeVoice (step 2)
    private void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice(); // This will call makeVoice() on each animal object
        }
    }

    // Overloaded hear method to allow calling it from the template method
    public void hear() {
        // This method will be called from the template method
        System.out.println("Start hearing the animals...");
    }
}

// Test.java - Class to test the Voice2
public class Test {
    public static void main(String[] args) {
        // Create a Voice2 object and test the template method
        Voice2 voice2 = new Voice2();
        voice2.templateMethod();  // This ensures the correct order of method calls
    }
}
