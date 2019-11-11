import java.util.Scanner;


public class evenOrOdd {
    public static void main(String[] arg) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number to check if it is even or odd:");
        number = keyboard.nextInt();

        System.out.println(evenOdd(number));
    }

    public static String evenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
