import java.util.Scanner;

public class java_output_formatting {
    public static void main(String[] args) {
        String s1 = "java";
        Scanner sc = new Scanner(System.in);
        String sampleString = "               ";
        for (int i = 0; i <= s1.length(); i++) {
            sampleString.charAt(i) = s1.charAt(i);
        }
        System.out.print(sampleString);
    }
}