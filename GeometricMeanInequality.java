/* https://www.codechef.com/problems/GMINEQ */
/* Geometric Mean Inequality */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GeometricMeanInequality
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    int x , y;
	    while(t-- > 0) {
	        x = y = 0;
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i = 0; i<n; i++)  {
	           a[i] = sc.nextInt(); 
	           if(a[i] == 1){
	               x++;
	           } else {
	               y++;
	           }
	        }
	        if(Math.abs(x-y) < 2)  {
                System.out.println("YES");
            }
            else if(Math.abs(x-y) == 2)  { 
                if( y%2 != 0) {
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
            else System.out.println("NO");
	        
	    }
	}
}
