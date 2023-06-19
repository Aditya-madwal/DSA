public class shadowing {

  static int x = 100;
  // this "static" keyword globalizes the integer x
  // the value of x will be same for all the classes and objects in this code
  // basically the x is global for the code
  // x=100;

  public static void main(String[] args) {

    System.out.println("shadowing in java : ");

    System.out.println(x); // prints 100

    int x = 300;
    System.out.println(x); // this one prints 300
    // when the globalized integer is reinitialised then the new value is the value
    // of x

    something(); // this prints x (x = 100)

  }

  public static void something() {
    System.out.println(x); // this one refers to the x = 100
    // because the reinitialization of the x doesnt take place in the SOMETHING
    // BLOCK
  }
}