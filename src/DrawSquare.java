import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawSquare {

    public static void Squares(int rows)
    {
        int i, j;

        for (i = 1; i <= rows; i++)
        {


            for (j = 1; j <= rows; j++)
                System.out.print("#");
                System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        int rows;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of squares you want: ");
        rows = keyboard.nextInt();
        Squares(rows);
    }

}
