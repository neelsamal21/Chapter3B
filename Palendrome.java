import java.util.*;

/**
 * Write a description of class Palendrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palendrome
{
   public static void main(String[] args)
   {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter your palindrome ");
       String palendrome = keyboard.nextLine();
       
       palendrome = palendrome.toUpperCase();
       int numchar = palendrome.length();
       char first;
       char last;
       int forward = 0;
       int backward = numchar-1;
       boolean isPalendrome = true;
       
       while(forward<backward)
       {
           first = palendrome.charAt(forward);
           last = palendrome.charAt(backward);
           
           if(Character.isWhitespace(first))
                   forward +=1;
                   first = palendrome.charAt(forward);
           if(Character.isWhitespace(last))  
                   backward -=1;
                   last = palendrome.charAt(backward);

           if(first != last){
               isPalendrome = false;
               break;
            }
           forward += 1;
           backward -=1;       
           }
           
       if(isPalendrome)
           System.out.println("The string is a palindrome");
       else
           System.out.println("The string is NOT a palindrome");
       
       
   }
}
