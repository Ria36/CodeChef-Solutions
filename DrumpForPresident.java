/* https://www.codechef.com/problems/STUDVOTE */
/* Drumpf for President! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DrumpForPresident
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
	  int t = input.nextInt();
	  while(t-- > 0){
	      int n = input.nextInt();
	      int k = input.nextInt();
	      int[] a = new int[n];
	      for(int i = 0;i < n;i++){
	          a[i]=input.nextInt();
	      }
	      int count = 0;
	      int[] b = new int[n+1];
	      for(int i = 0;i < n ; i ++){
	          b[a[i]]++;
	      }
	      for(int i=0;i<n;i++){
	          if(a[i]==(i+1)){
	              b[a[i]]=0;
	          }
	      }
	      for(int i =1;i <=n;i++){
	          if(b[i] >= k){
	              count++;
	          }
	          }
	          System.out.println(count);
	      }
	}
}
