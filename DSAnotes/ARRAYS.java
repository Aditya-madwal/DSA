// package DSAnotes;

import java.util.Scanner;

public class ARRAYS {
    public static void main(String[] args) {
        System.out.println("arrays in java");
        Scanner in = new Scanner(System.in);

        // declaration and initialisation :
        int[] marks = new int[5];
        marks[0] = 23;
        marks[1] = 34;
        marks[2] = 56;
        marks[3] = 78;
        marks[4] = 90;

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.print("\n");
        // inputing the array :
        String[] names = new String[5];

        for (int j = 0; j < names.length; j++) {
            names[j] = in.nextLine();
        }

        System.out.println("entered names are : ");

        for (int i = 0; i < marks.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n");
        // TO directly call out the elements instead of their index values :

        for (int m : marks) {
            System.out.print(m + " "); // here 'm' represents the elements of the array
        }
    }
}
