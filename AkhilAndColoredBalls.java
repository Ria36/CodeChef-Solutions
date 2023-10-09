/* https://www.codechef.com/problems/ACBALL */
/* Akhil And Colored Balls */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AkhilAndColoredBalls
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    String X = sc.nextLine();
		    String Y = sc.nextLine();
		    int n = X.length();
		    
		    char[] Z = new char[n];
		    //System.out.println(n);
		    for(int i=0;i<n;i++){
		        if(X.charAt(i) == 'W' && Y.charAt(i) == 'W'){
		            Z[i] = 'B';
		        }
		        else if(X.charAt(i) =='B' && Y.charAt(i) == 'B'){
		            Z[i] = 'W';
		        }
		        else
		            Z[i] = 'B';
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(Z[i]);
		    }
		    System.out.println();
		}
	}
}
