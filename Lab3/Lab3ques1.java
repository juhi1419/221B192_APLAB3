// Abstract base class for Bharatvanshis
abstract class Bharatvanshi {

    // Non-abstract method common to all Bharatvanshis
    public void fight() {
        System.out.println(this.getClass().getSimpleName() + " is a fighter!");
    }

    // Abstract method for obedience (to be implemented by subclasses)
    public abstract void obey();

    // Abstract method for kindness (to be implemented by subclasses)
    public abstract void kind();
}

// Abstract class for Pandavs (inherits from Bharatvanshi)
abstract class Pandav extends Bharatvanshi {

    // All Pandavs are obedient, so we define this method here
    @Override
    public void obey() {
        System.out.println(this.getClass().getSimpleName() + " is obedient.");
    }

    // Abstract method for kindness, to be defined by subclasses
    public abstract void kind();
}

// Abstract class for Kauravs (inherits from Bharatvanshi)
abstract class Kaurav extends Bharatvanshi {

    // All Kauravs are disobedient
    @Override
    public void obey() {
        System.out.println(this.getClass().getSimpleName() + " does not obey!");
    }

    // Kauravs are cruel by default, but some can be kind
    @Override
    public void kind() {
        System.out.println(this.getClass().getSimpleName() + " is cruel!");
    }
}

// Concrete class for Arjun (extends Pandav)
class Arjun extends Pandav {

    @Override
    public void kind() {
        System.out.println(this.getClass().getSimpleName() + " is kind.");
    }
}

// Concrete class for Bheem (extends Pandav)
class Bheem extends Pandav {

    @Override
    public void kind() {
        System.out.println(this.getClass().getSimpleName() + " is less kind than Arjun.");
    }
}

// Concrete class for Duryodhan (extends Kaurav)
class Duryodhan extends Kaurav {

    @Override
    public void kind() {
        System.out.println(this.getClass().getSimpleName() + " is cruel!");
    }
}

// Concrete class for Vikarn (extends Kaurav)
class Vikarn extends Kaurav {

    @Override
    public void obey() {
        System.out.println(this.getClass().getSimpleName() + " is obedient.");
    }

    @Override
    public void kind() {
        System.out.println(this.getClass().getSimpleName() + " is kind.");
    }
}

// Testing the classes
public class Main {
    public static void main(String[] args) {
        // Create instances of the concrete classes
        Bharatvanshi arjun = new Arjun();
        arjun.fight();
        arjun.obey();
        arjun.kind();

        Bharatvanshi bheem = new Bheem();
        bheem.fight();
        bheem.obey();
        bheem.kind();

        Bharatvanshi duryodhan = new Duryodhan();
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        Bharatvanshi vikarn = new Vikarn();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
