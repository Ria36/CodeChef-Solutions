/* https://www.codechef.com/problems/CHFCHK */
/* Chef Chick */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefChick
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,i,j,k,l,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0){
		    n = sc.nextInt();
		    ArrayList<Integer> al = new ArrayList<Integer>();
		    for(i = 0; i<n; i++)
		        al.add(sc.nextInt());
		    System.out.println(Collections.min(al));
		}
	}
}

