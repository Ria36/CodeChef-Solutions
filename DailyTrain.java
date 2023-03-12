/* https://www.codechef.com/problems/DAILY */
/* Daily Train */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int fact(int n)
     {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n, x;
        Scanner sc = new Scanner(System.in);
		int count=0, sum=0;
		x= sc.nextInt();
		n= sc.nextInt();
		
		for(int k=0; k<n; k++){
		    String s = sc.next();
		      for(int i=0,j=53;i<j;i+=4,j-=2)
            {
                count =0;
                if(s.charAt(i)=='0')
                {
                    count++;
                }
                if(s.charAt(i+1)=='0')
                {
                    count++;
                    
                }
                if(s.charAt(i+2)=='0')
                {
                    count++;
                }
                if(s.charAt(i+3)=='0')
                {
                    count++;
                }
                if(s.charAt(j)=='0')
                {
                    count++;
                }
                if(s.charAt(j-1)=='0')
                {
                    count++;
                }
                if(count<x)
                {
                    sum += 0;
                }
                else
                {
                    sum += (fact(count)/(fact(x)*fact(count-x)));
                }
            }

		} 
		System.out.println(sum);
	}
}
