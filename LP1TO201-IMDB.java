/* Motivation */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int maxSpace=sc.nextInt();
	        int maxRating=0;
	        while(n-->0)
	        {
	            int size=sc.nextInt();
	            int rating=sc.nextInt();
	            if(size<=maxSpace && rating>maxRating)
	                maxRating=rating;
	        }
	        System.out.println(maxRating);
		}
	}
}
