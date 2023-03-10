/* https://www.codechef.com/problems/AUCTION */
/* Bidding */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Bidding
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int aliceRupees = sc.nextInt();
		    int bobRupees = sc.nextInt();
		    int charlieRupees = sc.nextInt();
		    if(aliceRupees>bobRupees && aliceRupees>charlieRupees){
		        System.out.println("Alice");
		    }
		    else if(bobRupees>aliceRupees && bobRupees>charlieRupees){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Charlie");
		    }
		}
	}
}
