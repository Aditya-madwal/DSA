import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        System.out.println("variable arguments");

        variableArgs(2, 4, 32, 23, 67);

        var_args_with_defined_args(34, 45, "aditya", "ayush", "rahul");
    }

    static void variableArgs(int... v) {
        // this takes multiple values from argument and holds them in an array (v)

        System.out.println(Arrays.toString(v));
        // this prints the array as string [2, 4, 32, 23, 67]

        System.out.println(v[1]);
        // prints : 4
        // since v is an array and 4 is the element at the index : 1

    }

    static void var_args_with_defined_args(int a, int b, String... names) {
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("the names are " + Arrays.toString(names));

        int len_names = names.length;
        System.out.println(len_names);
        int i;
        for (i = 0; i < len_names; i++) {
            System.out.println("name number " + i + " is " + names[i]);
        }
    }

    // FUNCTION OVER LOADING :
    // when 2 or more functions have the same name and return type are not same if
    // the arguments in the both the functions are different. and according to the
    // argument provided in the main() function... the main() function decides the
    // function to go along

}