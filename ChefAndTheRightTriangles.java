/* https://www.codechef.com/problems/RIGHTRI */
/* Chef and The Right Triangles */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndTheRightTriangles
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    int n = 0;
	    for (int t=0;t<T;t++)
	    {
	        int x1 = s.nextInt();
	        int y1 = s.nextInt();
	        int x2 = s.nextInt();
	        int y2 = s.nextInt();
	        int x3 = s.nextInt();
	        int y3 = s.nextInt();
	        int d1 = (int)((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	        int d2 = (int)((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
	        int d3 = (int)((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
	        if ((d1==d2+d3) || (d2==d1+d3) || (d3==d1+d2))
	        {
	            n++;
	        }
	    }
	    System.out.println(n);
	}
}
