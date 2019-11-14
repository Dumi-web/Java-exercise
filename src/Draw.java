import java.util.Scanner;

public class Draw
{
    public static void Square(int rows)
    {
        int i , j;
            for(i = 1 ; i <= rows; i++)
            {
                for (j = 1; j <= rows; j++)
                    System.out.print("#");
                    System.out.print("\n");
            }
    }
    public static void main(String[] arg)
    {
        int rows;
        Scanner me = new Scanner(System.in);
        System.out.print("Enter number of squares: ");
        rows = me.nextInt();
        Square(rows);
    }
}

