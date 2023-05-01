/* https://www.codechef.com/problems/PCJ18A */
/* Chef and Secret Ingredient */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
          int T=sc.nextInt();
         while(T-->0) {
        	 int count=0;
          int N=sc.nextInt();
          int X=sc.nextInt();
         int[] ing=new int[N];
          for(int i=0;i<N;i++) {
        	  ing[i]=sc.nextInt();
          }
          for(int i=0;i<N;i++) {
        	  if(ing[i]>=X) {
        		 count++;
        	  }
        	  else {
        		  continue;
        	  }
          }
          if (count>=1) {
        	  System.out.println("YES");
          }
          else {
        	  System.out.println("NO");
          }
         }
	}
}
