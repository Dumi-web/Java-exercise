import java.util.Enumeration;

public class CombineArrays {
    public static void main(String[]args){

        String[] Patterns = {"1","2","3","4","5","6"};
        String[] Numbers = {"7","8","9","10"};

        System.out.print(Arrays(Patterns , Numbers));
    }
    public static String[] Arrays(String[]numArray , String[]digitArrays)
    {
        String[] newArray = new String [numArray.length + digitArrays.length];

        for (int i = 0; i < newArray.length; i++)
        {
            for(int j = 0; j<= i;j++) {
                newArray[i] = numArray[i] + digitArrays[i];

            }
        }


        return newArray;
    }


}
