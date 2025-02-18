// Mother class with an overridden show method
class Mother {
    // Method show in Mother class
    void show() {
        System.out.println("Hello World");
    }
}

// Child class that overrides the show method of Mother class
class Child extends Mother {
    // Method show in Child class (overrides Mother's show method)
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}

// Application class to test method overriding
class Application {
    public static void main(String args[]) {
        // Create an object of Mother class
        Mother m = new Mother();
        m.show();  // Calls the show() method from the Mother class

        // Create an object of Child class
        Child ch = new Child();
        ch.show();  // Calls the overridden show() method from the Child class

        // Demonstrate runtime polymorphism by using a Mother reference to hold a Child object
        Mother m1 = new Child();
        m1.show();  // Calls the overridden show() method from the Child class, not the Mother class
    }
}
