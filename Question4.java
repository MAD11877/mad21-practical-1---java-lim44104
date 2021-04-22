import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("");
    int num = in.nextInt();
    int i=0, j=0;
    while(i<num)
    {
    j = num;
    while(j>i)
    {
      System.out.print("*");
      j--;
    }
    System.out.println();
    i++;
    }
    
  }
}
