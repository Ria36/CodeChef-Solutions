/* https://www.codechef.com/problems/ISPAR */
/* Is this priority or parity! */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class IsThisPriorityOrParity
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    long N=sc.nextLong();
		    long R=sc.nextLong();
            if(R==1){
                if(N%2==0) System.out.println("EVEN");
                else System.out.println("ODD");
            } else if(R==2) System.out.println("ODD");
            else System.out.println("EVEN");
            		    
		}
	}
}
