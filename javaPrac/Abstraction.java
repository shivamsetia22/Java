abstract class Animal {
    abstract void walk();
    Animal () {
        System.err.println("New Animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
    Horse() {
        System.out.println("Created a horse");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();

        // h1.walk();
        // h1.eat();
    }
}
