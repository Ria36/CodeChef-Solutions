/* https://www.codechef.com/problems/UWCOI20B */
/* Button Pairs */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ButtonPairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T-->0){
		    int N = Integer.parseInt(in.readLine());
		    int[] A = new int[N];
		    String[] S = in.readLine().split(" ");
		    for(int i=0;i<N;i++) A[i] = Integer.parseInt(S[i]);
		    long count=0;
		    for(int i=0;i<N;i++) if(A[i]%2!=0) count++;
		    System.out.println(count*(N-count));
		}
	}
}
