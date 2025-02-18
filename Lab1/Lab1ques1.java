// Mother class with an integer member 'x' and a method 'show'
class Mother {
    int x = 10;

    // Constructor
    Mother() {
        System.out.println("Mother class constructor called.");
    }

    // Method to display the value of 'x'
    void show() {
        System.out.println("Mother's value of x: " + x);
    }
}

// Child class that inherits from Mother
class Child extends Mother {
    // Constructor
    Child() {
        System.out.println("Child class constructor called.");
    }

    // The show method is inherited from the Mother class
    // No need to override it unless you want to modify its behavior
}

// Application class to test inheritance
class Application {
    public static void main(String args[]) {
        // Create an object of Mother class
        Mother m = new Mother();
        m.show();  // Calls the 'show()' method from the Mother class

        // Create an object of Child class
        Child ch = new Child();
        ch.show();  // Calls the inherited 'show()' method from the Mother class
    }
}
