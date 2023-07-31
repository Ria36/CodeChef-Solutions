/* https://www.codechef.com/problems/GENIUS */
/* Exact Marks */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ExactMarks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
	    while(t-->0){
	       int que = sc.nextInt();
		    int tot = sc.nextInt();
		    int rem = tot%3;
		    int a, b;
		    if(rem > 0) {
		        a =tot/3 + 1;
		        b = 3 - rem;
	        } else {
	            a = tot/3;
	            b = 0;
	        }
		    int c = que-(a+b);
		    if(c < 0){
		        System.out.println("NO");
		    } else {
		        System.out.println("YES");
		        System.out.println(a + " " + b + " " + c);
		    }
	    }
	}
}

