/* https://www.codechef.com/problems/GRIDXOR */
/* Sarthak and his Magic Grid */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SarthakAndHisMagicGrid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while ( t > 0){
		    int n = in.nextInt();
		    for ( int i = 0 ; i < n ; i++){
		        for ( int j = 0 ; j < n ; j++){
		            System.out.print(1 + " ");
		        }
		        System.out.println();
		    }
		    t--;
		}
	}
}
