import java.util.Scanner;

public class Isosceles
{
    public static void iso(int num)
    {
        int i, j,k;
        for (i = 1; i <= num; i++)
        {
            for (j = num; j >= i; j--)
            {
                System.out.print(" ");
            }

            for (k = 1; k <=(2*i -1); k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
        public static void main (String[]args)
        {
            int num;
            Scanner love = new Scanner(System.in);
            System.out.print("How many Isosceles triangles do you want? ");
            num = love.nextInt();
            iso(num);

        }
}

