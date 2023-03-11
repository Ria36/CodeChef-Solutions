/* https://www.codechef.com/problems/LONGSEQ */
/* Chef and digits of a number */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndDigitsOfaNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    String str=sc.next();
		    int count0=0,count1=0;
		    for(int i=0;i<str.length();i++)
		    {
		    if(str.charAt(i)=='0')
		    count0++;
		    else if(str.charAt(i)=='1')
		    count1++;
		    }
		    if(count1==1 || count0==1)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
