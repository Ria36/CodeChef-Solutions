/* https://www.codechef.com/problems/CHEFCH */
/* Chef and Chain */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndChain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		   
		    String s1=sc.next();
		    int k=s1.length();
		    int count=0;
		    int cc=0;
		    for(int j=0;j<k;j++)
		    {
		        if(j%2==0)
		        {
		            if(s1.charAt(j)=='+')
		            {
		                count++;
		            }
		            else{
		                cc++;
		            }
		        }
		        else{
		            if(s1.charAt(j)=='+')
		            {
		                cc++;
		            }
		            else{
		                count++;
		            }
		        }
		    }
		    System.out.println(Math.min(count,cc));
		    
		}
	}
}
