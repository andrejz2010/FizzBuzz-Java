/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fizzbuzz;

public class App {


    public static boolean isDivideble(int a, int b) {
        return a % b == 0;
    }


    public static void fizzbuzz() {


        for (int i = 1; i <= 300; i++) {
            String output = "";


            if (isDivideble(i, 3)) {
                output += "Fizz";
            }


            if (isDivideble(i, 13)) {
                if (isDivideble(i, 11)) {
                    output += "FezzBong";
                    System.out.println(i + ") " + output);
                    continue;

                } else {
                    output += "Fezz";

                }
            }

            if (isDivideble(i, 5)) {
                output += "Buzz";
            }
            if (isDivideble(i, 7)) {
                output += "Bang";
            }
            if (isDivideble(i, 11)) {

                output = "Bong";
            }
            if (output.length() == 0) {
                output = String.valueOf(i);
            }
            System.out.println(i + ") " + output);
        }
    }


    public static void main(String[] args) {
        fizzbuzz();
    }
}
