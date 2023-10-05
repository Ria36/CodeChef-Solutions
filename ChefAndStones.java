/* https://www.codechef.com/problems/CHEFSTON */
/* Chef and Stones */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndStones
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    
		    long [] stone=new long[N];
		    for(int i=0;i<N;i++){
		        stone[i]=K/sc.nextLong();
		    }
		    long [] cash=new long [N];
		    for(int i=0;i<N;i++){
		        cash[i]=stone[i]*sc.nextLong();
		    }
		    Arrays.sort(cash);
		    System.out.println(cash[N-1]);
		}
	}
}

