/* https://www.codechef.com/problems/NUMCOMP */
/* Archi and Comparsion */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArchiAndComparsion
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i=0;i<T;i++) {
		    
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    long n = sc.nextLong();
		    
		    if(n%2==0){
		        a= Math.abs(a);
		        b = Math.abs(b);
		    }
		    if(a>b) {
		        System.out.println(1);
		    } else if(a<b) {
		        System.out.println(2);
		    } else {
		        System.out.println(0);
		    }
		}
	}
}

