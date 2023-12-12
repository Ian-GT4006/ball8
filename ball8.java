
 import java.util.Scanner;
 import java.util.Random ;
 //import java.lang.Math.*;

public class ball8 {

   
    public static void main (String[] args){
        Scanner ask = new Scanner (System.in);
        System.out.println("Ask a question!");
        Random rand = new Random();
        int randomint = rand.nextInt(6);
        String question = ask.nextLine();
        String answer = " ";
       
        if (randomint == 0){
                answer = "yes";
            }
        if (randomint == 1){
                answer = "no";
            }
        if (randomint == 2){
                answer = "of course!!!!";
            }
        if (randomint == 3){
                answer = "i have no idea.";
            }
        if (randomint == 4){
                answer = "that's the worst idea ive ever heard.";
            }
        if (randomint == 5){
                answer = "do it";
            }
        ask.close();
        
        System.out.println(question + "   " + answer);

        }
        
           // public static int Random(int[] args){
            
           // int min = 1, max = 6;
            }
        

        
        
        
        
        
        
        
        
        
        
        
        

    


 