// Person class - the base class
class Person {
    public void walk() {
        System.out.println("I can walk");
    }

    public void talk() {
        System.out.println("I can talk");
    }

    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }
}

// MathsTeacher class - derived from Person class
class MathsTeacher extends Person {
    public void teachMaths() {
        System.out.println("I can teach maths");
    }
}

// Footballer class - derived from Person class
class Footballer extends Person {
    public void playFootball() {
        System.out.println("I can play football");
    }
}

// Businessman class - derived from Person class
class Businessman extends Person {
    public void runBusiness() {
        System.out.println("I can run a business");
    }
}

// Main class to create objects and test the classes
public class Q6 {
    public static void main(String[] args) {
        MathsTeacher teacher = new MathsTeacher();
        teacher.walk();
        teacher.talk();
        teacher.teachMaths();

        Footballer player = new Footballer();
        player.walk();
        player.talk();
        player.playFootball();

        Businessman tycoon = new Businessman();
        tycoon.walk();
        tycoon.talk();
        tycoon.runBusiness();
    }
}
