/* https://www.codechef.com/problems/MINDIST1 */
/* Minimum distance between 1s */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinimumDistanceBetween1s
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s=sc.next();
		    int ans=0,ans1=0;
		    for(int i=0;i<n;i++)
		    if(s.charAt(i)=='1')
		    {
		        if(i%2==0)
		        ans++;
		        else
		        ans1++;
		    }
		    if(ans>0 && ans1>0)
		    System.out.println("1");
		    else
		    System.out.println("2");
		}
	}
}
