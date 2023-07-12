/* https://www.codechef.com/problems/FUNHAND */
/* Funny Hand */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FunnyHand
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	     
	          int n=sc.nextInt();
	          int a=sc.nextInt();
	          int b=sc.nextInt();
	          int ans=0;
	          if(Math.abs(a-b)>2 || a==b) ans=0;
	          else{
	              if(a==1 || b==1 || a==n || b==n){
	                  ans=1;
	              }
	              else{
	                  if(Math.abs(a-b)==1){
	                      ans=2;
	                  }
	                  else ans=1;
	              }
	          }
	          System.out.println(ans);
	    }
	}
}

