import java.util.Scanner;

public class methods { 
    // Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("methods or functions in java");
        sum();

        System.out.println(substract(23,56));

        System.out.println(greet());
    }

    // general form of a method (out of the public static void main) :

    // sample_funtion() {
    //     body code ;
    //     return statement;
    // }
    

    static int sum(){
        Scanner input = new Scanner(System.in);

        System.out.print("enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("enter number 2 : ");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        System.out.println("the sum = " + sum);
        return 0;
    }

    // arguments in methods :

    static int substract(int n1, int n2){
        Scanner input = new Scanner(System.in);
        int diff = n1 - n2;
        return diff;
    }
    

    static String greet() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        // System.out.println("hello " + name);
        return ("hello " + name);
    }

}
