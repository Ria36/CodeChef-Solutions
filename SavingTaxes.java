/* https://www.codechef.com/problems/TAXSAVING */
/* Saving Taxes */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SavingTaxes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x>y){
		        int result = x-y;
		        System.out.println(result);
		    }
		}
	}
}
