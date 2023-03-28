/* https://www.codechef.com/problems/TAXES */
/* Tax in Chefland */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TaxInChefland
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    if(x<=100){
		        System.out.println(x);
		    }
		    else{
		        System.out.println(x-10);
		    }
		}
	}
}
