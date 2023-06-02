// HL5  QUESTION    
// 2. Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides( ). Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides( ) that shows the number of sides in the given geometrical structures. 

abstract class Shape {
  abstract void numberOfSides();
}


class Rectangle extends Shape {
  void numberOfSides() {
    System.out.println("A rectangle has 4 sides.");
  }
}

class Triangle extends Shape {
  void numberOfSides() {
    System.out.println("A triangle has 3 sides.");
  }
}

class Hexagon extends Shape {
  void numberOfSides() {
    System.out.println("A hexagon has 6 sides.");
  }
}

// MAIN CLASS
class TestShape {
  public static void main(String[] args) {
    
    Shape[] shapes = new Shape[3];
    shapes[0] = new Rectangle();
    shapes[1] = new Triangle();
    shapes[2] = new Hexagon();
    
    for (int i=0; i<shapes.length; i++ ) {
      shapes[i].numberOfSides();
    }
  }
}
