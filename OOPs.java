// import sample_package.*;

// user defined class ------------------------------------------------------

// parametrized construction -----------------------------------------------

class human {
    String name;
    String gender;
    int number;

    public void main() {
        System.out.println("hello");
    }

    public void whatSex() {
        System.out.println(this.gender);
    }
}

// parametrised construction -----------------------------------------------

class Student {
    String name;
    int age;

    // the name of class and name of the constructor is always the same

    Student(String name, int age) { // CONSTRUCTOR
        this.name = name;
        // (this.attribute = argument)
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

// copy construction -------------------------------------------------------

class car {
    String model;
    int plate;

    car(car sample_car) {
        this.model = sample_car.model;
        // copies the model name of the sample car into the car just created
        this.plate = sample_car.plate;
    } // ( this is a copy constructor )

    public void printInfo() {
        System.out.println(this.model);
        System.out.println(this.plate);
    }

    car() {

    } // this empty constructor is created
      // bcz copy constructor w/o any actuall constructor wil not work
}

// inheritance in java (parent class and child class) :---------------------

class parentClass {
    // THIS IS THE PARENT CLASS
    String name;

    public void sample_method() {
        System.out.println("this child is " + this.name);
    }
}

class childClass extends parentClass {

}

// ACCESS MODIFIERS --------------------------------------------------------

class sample_class {
    // PUBLIC
    public String name; // this can be used any where and everywhere
    // DEFAULT
    String surname; // this can be used in this package only note other packages
    // PROTECTED
    protected String email; // this can be used in this package and subclasses of other packages only
    // PRIVATE
    private String password; // this can be used in this class only not even the main class
}

// ABSTRACT CLASSES :- ---------------------------------------------------

abstract class animal {
    String name;
    int legs;

    // animal(String name, int legs) {
    // this.name = name;
    // this.legs = legs;
    // }

    public void walks() {
        System.out.println(this.name + " walks on " + this.legs + " legs");
    }
}

class horse extends animal {

}

// main java class ---------------------------------------------------------
public class OOPs {
    public static void main(String[] args) {
        // object initiasation :-
        // general form :
        // className objName = new className()
        human human1 = new human();
        human1.name = "aditya";
        human1.gender = "male";
        human1.number = 9817;

        human1.whatSex(); // prints "male"

        Student s1 = new Student("ayush", 15);
        s1.printInfo();

        car c1 = new car();
        c1.model = "bugatti";
        c1.plate = 6758;
        // parameters of the object c1 are setted up

        car c2 = new car(c1);
        // info (attributes) of the object c1 are copied in the c2 object
        c2.printInfo();

        // inheritance :
        childClass child1 = new childClass();
        child1.name = "vikram aditya";
        child1.sample_method();
        // here child class didnt have any attraibute or method
        // but the parent class did
        // so child class since extends the parent class the parent class attributes and
        // methods get inherited by the child class

        // ------------------------------------------------------
        // accessing the SAMPLE PACKAGE :
        // sample_package.Account a1 = new sample_package.Account()
        // a1.account_holder = "aditi"
        // etc etc etc

        // abstracttion :---------------------------------------

        // animal h1 = new animal("horse", 4);
        // h1.walks(); // these GIVES ERROR because the ANIMAL class is abstract and can
        // not be used but its child classes can be used

        horse h1 = new horse();
        h1.name = "mikey the horse";
        h1.legs = 4;
        h1.walks(); // this is fine bcz horse class is default

    }
}
