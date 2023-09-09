/* https://www.codechef.com/problems/MAXORMIN */
/* Maximum OR Minimum */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaximumOrMinimum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-- > 0)
{
   int n=sc.nextInt();
   ArrayList<Integer> a=new ArrayList<>();
   for(int i=0;i<n;i++)
   {
       a.add(sc.nextInt());
   }
   int odd=0,even=0;
   for(int i=0;i<n;i++)
   {
       if(a.get(i)==1)
       odd++;
       else
       even++;
   }
   if(odd>=even)
   System.out.println(1);
   else
   System.out.println(0);
}
	}
}
