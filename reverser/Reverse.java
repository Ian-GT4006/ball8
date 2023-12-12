package reverser;
public class Reverse {

    public static void main (String[] args){
        System.out.println(reverse  ( "cheese"));
    }

    public static String reverse(String word){

        String reversedString = "";
        String ithLetter = "";
        int y=word.length();
        for ( int x=0; x<y; x++)  {
            ithLetter = String.valueOf(word.charAt(x));
            reversedString = ithLetter + reversedString;
        }
        return reversedString;

    }









}