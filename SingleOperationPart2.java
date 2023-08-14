/* https://www.codechef.com/problems/SINGLEOP2 */
/* Single Operation Part 2 */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SingleOperationPart2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner (System.in);
		int t = scn.nextInt();
		while(t-->0)
		{
		    int n = scn.nextInt();
		    String x = scn.next();
		    int ans = 0;
		    for(int i = 1;i<n;i++)
		    {   
		        if(x.charAt(i)=='1')
		        {
		            ans = i;
		            break;
		        }
		    }
		    if(ans==0)
		    {
		        ans = n;
		    }
		    System.out.println(ans);
		}
	}
}

