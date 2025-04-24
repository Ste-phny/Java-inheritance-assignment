class Animal {
    void eat() {
        System.out.println("Animal eat");
    }

    void sleep() {
        System.out.println("Animals sleep");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals walk");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dogs bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.walk();
        d.bark();
    }
}