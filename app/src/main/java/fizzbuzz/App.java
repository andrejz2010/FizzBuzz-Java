/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fizzbuzz;

public class App {
    public static void fizzbuzz() {

        for (int i = 1; i <= 100; i++) {
            String result = "";

            if (i % 5 == 0 && i % 3 == 0) {
                result = "fizzbuzz";
            } else if (i % 3 == 0) {
                result += "fizz";
            } else if (i % 5 == 0) {
                result += "buzz";
            } else {
                result += i;
            }
            System.out.println(result);

        }
    }

    public static void main(String[] args) {
        fizzbuzz();
    }
}
