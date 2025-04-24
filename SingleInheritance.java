class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Antelope extends Animal {
    void antelopeSound() {
        System.out.println("Snorts");
    }
}

public class Main {
    public static void main(String[] args) {
        Antelope a = new Antelope();
        a.eat();
        a.antelopeSound();
    }
}
