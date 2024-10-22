
/**
 * Write a description of class TriangleOfStars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleOfStars
{
    public static void main(String [] args)
    {
        int rows = 5;
        for(int x = 0; x<rows; x++)
        {
            for(int k = 0; k<x; k++)
                System.out.print(" ");
            for(int z = 5-x; z>0; z--)
                System.out.print("*");
                System.out.println();
        }
    }
}
