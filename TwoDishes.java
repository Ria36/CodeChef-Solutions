/* https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/TWODISH */
/* Two Dishes */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoDishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int count=0;
            while(b!=0)
            {  if(a==0&&c==0)
               break;
                if(a==0)
                {
                    b--;
                    c--;
                }
                else{
                    a--;
                    b--;
                }
                count++;
            }
            System.out.println((count>=n)? "yes":"no");
		    
		}
	}
}
