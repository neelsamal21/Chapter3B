import java.util.Random;
/**
 * Write a description of class Monty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monty
{
    public static void main(String [] args)
    {
        int strat1= 0;
        int strat2 = 0;
        int count = 0;
        int rand = 0;
        int choice;
        Random random = new Random();
        while(count<=1000)
        {
            count += 1;
            rand = random.nextInt(3)+1;//where car is
            choice = random.nextInt(3)+1;
            if(rand == choice)
                {
                    strat2 += 1;
                }
        }
        System.out.println("strat 1 " + (1000-strat2));
        System.out.println("Strat 2 " + strat2);
    }
}
