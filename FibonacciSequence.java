import java.util.Scanner;

/**
 * Write a description of class FibonacciSequence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonacciSequence
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What number of Fibonacci's sequance would you to see till ?");
        int num = keyboard.nextInt();
        int start = 0;
        int second = 1;
        int next;
        for(int x=0; x<=num;x=second+next)
        {
            System.out.println(start+second);
            next=start+second;
            
            
        }
    }
}
