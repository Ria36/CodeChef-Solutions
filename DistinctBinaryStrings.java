/* https://www.codechef.com/problems/BINSTRING */
/* Distinct Binary Strings */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DistinctBinaryStrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int p = sc.nextInt();
		
		for(int i=0;i<p;i++)
		{
		    int l = sc.nextInt();
		    String s = sc.next();
		    String[] str = s.split("");
		    
		    String curr= "2";
		    int counth=0;
		    for(int j=0;j<l;j++)
		    {
		        if(curr.equals(str[j])== false)
		        {
		            counth++;
		            curr =str[j];
		        }		        
		    }
		    System.out.println(counth);
		}
	}
}
