class Reptile {
    void crawl() {
        System.out.println("Reptiles crawl");
    }

    void coldBlooded() {
        System.out.println("Reptiles are cold blooded");
    }
}

class Snake extends Reptile {
    void slither() {
        System.out.println("Snakes crawl");
    }
}

class lizard extends Reptile {
    void climb() {
        System.out.println("Lizards climb");
    }
}

public class Main {
    public static void (String[]args){
        snake s = new snake();
        System.out.println("Snake:");
        s.crawl ();
        s.coldBlooded();
        s.slither();
        
        System.out.println(" Lizard:");  
         lizard l = new lizard();
         l.crawl();
         l.coldBlooded();
         l.climb();
    }
 }