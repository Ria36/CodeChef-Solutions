/* https://www.codechef.com/problems/SSUBSTR */
/* Sorted Substrings */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SortedSubstrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    int ans = 0;
		    for(int i=1; i<n; i++){
		        if(s.charAt(i)=='0' && s.charAt(i-1)=='1')
		            ans++;
		    }
		    System.out.println(ans);
		}
	}
}
