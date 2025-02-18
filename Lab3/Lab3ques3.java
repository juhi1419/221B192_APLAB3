// Duck interface with common swim behavior
interface Duck {
    void swim();  // All ducks can swim
}

// Flyable interface for ducks that can fly
interface Flyable {
    void fly();
}

// Quackable interface for ducks that can quack
interface Quackable {
    void quack();
}

// Squeakable interface for ducks that squeak
interface Squeakable {
    void squeak();
}

// Mute interface for ducks that are mute
interface Mute {
    void mute();
}

// Rubber Duck (RD) class - cannot fly, squeaks
class RubberDuck implements Duck, Squeakable {
    @Override
    public void swim() {
        System.out.println("Rubber Duck is swimming.");
    }

    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}

// Wooden Duck (WD) class - cannot fly, mute
class WoodenDuck implements Duck, Mute {
    @Override
    public void swim() {
        System.out.println("Wooden Duck is swimming.");
    }

    @Override
    public void mute() {
        System.out.println("Wooden Duck is mute.");
    }
}

// RedHead Duck (RHD) class - can fly and quack
class RedHeadDuck implements Duck, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck is quacking.");
    }
}

// Lake Duck (LD) class - can fly and quack
class LakeDuck implements Duck, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("Lake Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck is quacking.");
    }
}

// Test the Duck Game
public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        ((Squeakable) rubberDuck).squeak();  // Casting to Squeakable to call squeak

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.swim();
        ((Mute) woodenDuck).mute();  // Casting to Mute to call mute

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();  // Casting to Flyable to call fly
        ((Quackable) redHeadDuck).quack();  // Casting to Quackable to call quack

        Duck lakeDuck = new LakeDuck();
        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();  // Casting to Flyable to call fly
        ((Quackable) lakeDuck).quack();  // Casting to Quackable to call quack
    }
}
