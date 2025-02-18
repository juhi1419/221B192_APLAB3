// Interface with a method declaration for display()
interface Testable {
    void display(); // By default, this method is public
}

// Concrete class implementing the Testable interface
class Test implements Testable {

    // Providing implementation for the display method
    @Override
    public void display() {
        System.out.println("This is the display method in the Test class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();  // Calls the display method from Test class
    }
}









// Abstract class implementing Testable
abstract class AbsTest implements Testable {
    // No implementation of display method here; it's abstract
}

public class Main {
    public static void main(String[] args) {
        // Trying to instantiate AbsTest will result in a compile-time error
        // AbsTest at = new AbsTest();  // This will give an error since AbsTest is abstract
        
        // We need a subclass that provides the display method
        class ConcreteTest extends AbsTest {
            @Override
            public void display() {
                System.out.println("This is the display method in the ConcreteTest class.");
            }
        }
        
        ConcreteTest ct = new ConcreteTest();
        ct.display();  // Calls the display method from ConcreteTest
    }
}



