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
       char first = palendrome.charAt(0);
       char second = palendrome.charAt(1);
       char last = palendrome.charAt(palendrome.length()-1);
       char seclast = palendrome.charAt(palendrome.length()-2);
       int forward = 2;
       int backward = palendrome.length()-2;
       String condensedpal = palendrome.substring(forward,palendrome.length()-2);
       int checkchar = 0;
       
       if(first==last && second == seclast)
       {
           checkchar = 4;
           numchar =- 4;
           while(numchar>0)
           {
               forward += 1;
               backward -= 1;
               String check = palendrome.substring(forward,backward);
               if(Character.isWhitespace(second))
                   check = palendrome.substring(forward +1,backward);
                   System.out.println("The string is NOT a palindrome");
                   numchar -= 1;
               if(Character.isWhitespace(seclast))  
                   check = palendrome.substring(forward,backward+1);
                   System.out.println("The string is NOT a palindrome");
                   numchar -= 1;
               if(check.charAt(forward)==check.charAt(backward))
                   checkchar += 2;
                   
                   numchar -= 2;
                   
           }
           
       }
       else
       {
           System.out.println("The string is NOT a palindrome");
       }
       
   }
}
