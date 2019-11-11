import java.util.Scanner;


public class Hello {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello " + "tell me you name?");
        String name = keyboard.next();
        System.out.println(Hi(name));
    }
    public static String Hi(String name){
        return "Hello "+ name;
    }



}
