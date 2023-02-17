class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printShape() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void printShape() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();    // This will call the printShape() method of Rectangle class
        square.printSquare();   // This will call the printSquare() method of Square class
    }
}
