


public class longestString {

    public static void main(String[] arg) {

        String[] Words = {"love","is", "beautiful", "I", "beautiful2", "beautiful4"};
        System.out.println(wordLength(Words));

    }
    public static String wordLength(String[] wordArray)
    {

        int maxLength = 0;
        String longestWord = "";
        for(String names: wordArray){
            if(names.length() > maxLength){
                maxLength = names.length();
            }
        }
        for(String names: wordArray)
            if(names.length() == maxLength)
            {
                longestWord += names + "\n";
            }
            return longestWord;
    }
}
