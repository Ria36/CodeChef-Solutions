/* https://www.codechef.com/problems/ADADISH */
/* Ada and Dishes */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AdaAndDishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int[] c = new int[n];
		    
		    for(int i=0; i<n; i++)
		    c[i] = sc.nextInt();
		    
		    Arrays.sort(c);
		    int tot_time = c[n-1];
		    int left_time = c[n-1];
		    
		    for(int i=n-2; i>=0; i--) {
		        if(left_time >= c[i])
		        left_time -= c[i];
		        else {
		            left_time = c[i] - left_time;
		            tot_time += left_time;
		        }
		    }
		    
		    System.out.println(tot_time);
		}
	}
}
