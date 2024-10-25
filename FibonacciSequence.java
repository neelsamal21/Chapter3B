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
        System.out.println("What number of Fibonacci's sequance would you to see ?");
        int num = keyboard.nextInt();
        int first = 0;
        int second = 1;
        int next;

        for(int x=0; first <=num;)
        {
            System.out.print(first + " ");
            next=first+second;
            first = second;
            second = next;
            
        }
        System.out.println();
    }
}
