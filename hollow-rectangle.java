import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);

        int rows = s.nextInt();
        int cols = s.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (row == 1 || row == rows || col == 1 || col == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}

// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 

