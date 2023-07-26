/* https://www.codechef.com/problems/GDOG */
/* Greedy puppy */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GreedyPuppy
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int max=0;
		    for(int i=1;i<=b;i++){
		        if(max<a%i)
		        max=a%i;
		    }
		    System.out.println(max);
		}
	}
}
