/* https://www.codechef.com/problems/STFOOD */
/* Chef and Street Food */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndStreetFood
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int profit=0;
		    for(int i=0;i<N;i++){
		        int s=sc.nextInt();
		        int p=sc.nextInt();
		        int v=sc.nextInt();
		        int curr= (p / (s+1))*v ;
		            profit=Math.max(profit,curr);
		    }
		    System.out.println(profit);
		}
	}
}

