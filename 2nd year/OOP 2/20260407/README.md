# Advance OOP Assessment

// Abstract class
abstract class Animal {
  public abstract void animalSound(); // abstract method

  public void sleep() { // regular method
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.sleep();
  }
}
