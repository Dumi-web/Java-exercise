import java.util.Scanner;

public class Triangle {

    public static void drawTriangle(int length)
    {
        int i , j;
            for(i = 0 ; i<length ; i++)
            {

            for(j = 0 ; j <= i ; j++) {
                System.out.print("#");
            }
                System.out.println();
            }
        }

    public static void main(String[] arg)
    {
        int length;
        Scanner du = new Scanner(System.in);
        System.out.print("How many triangles do you want? ");
        length= du.nextInt();
        drawTriangle(length);


    }
}
