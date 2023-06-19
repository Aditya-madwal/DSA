import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        // OUTPUTS IN JAVA :- 

        // println("hello world");
        System.out.println("hello world!");
        // simply prints the string 
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // the string[] is an array with arguments as the elements in the array 
        // calling the args[0] will give the value of argument given right after the function name

        // -------------------------------------------------

        // INPUTS IN JAVA :-

        Scanner input = new Scanner(System.in); // system.in means the standard input stream (keyboard)

        // System.out.println(input.nextInt());
        System.out.println("enter your name : ");
        String name = input.nextLine();

        System.out.println("your name is " + name);

        // -------------------------------------------------

        // primitive data types in java :
        // primitive datatupes are those which can not be broken down further
        int roll = 0011;
        char nname = 'a'; // single quotes always
        System.out.println(nname);
        float marks = 98.87f; // note - by default the decimal values are in double datatype ... we put f in last so its a float
        double largedecimalnumbers = 5652731.23123;
        // long largeintegers = 243422321231312;
        boolean check = true;


        // if else statements (condiotionals)

        boolean is_annu_gay = true;

        if (is_annu_gay == true) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

        // or we can write it like :

        if (is_annu_gay) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

        // !is_annu_gay is exact opposite of is_annu_gay


        // operators in java :

        if (10 > 90 || 89 < 90) {
            System.out.println("only one is true");
        }

        if (90 > 78 && 78 > 34) {
            System.out.println("both true");
        } else {
            System.out.println("one was wrong");
        }
    }

}