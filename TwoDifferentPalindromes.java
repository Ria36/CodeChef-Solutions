/* https://www.codechef.com/problems/TWODIFFPALIN */
/* Two Different Palindromes */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoDifferentPalindromes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner dp =new Scanner(System.in);
		int p=dp.nextInt();
		while(p-->0){
		    int n =dp.nextInt();
		    int s =dp.nextInt();
		    if((n%2==1 && s%2==1)||(n==1 || s==1)){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }
		}
	}
}
