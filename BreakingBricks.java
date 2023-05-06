/* https://www.codechef.com/problems/BRKBKS */
/* Breaking Bricks */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BreakingBricks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner s=new Scanner(System.in);
	   int t=s.nextInt();
	   while(t-->0){
	       int st=s.nextInt();
	       int []w=new int[3];
	       for(int i=0;i<3;i++){
	           w[i]=s.nextInt();
	       }
	           System.out.println(topToBottom(st,w));
	       }
	   }
	   public static int topToBottom(int st,int w[]){
	       int sum=0;
	       int ans=0;
	       for(int i=0;i<3;i++){
	           sum+=w[i];
	       }
	       int mx=Math.max(w[0],w[2]);
	       ans=(sum<=st)?1:((sum-mx)<=st)?2:3;
	       return ans;
	}
}

