/* https://www.codechef.com/problems/XORMAX */
/* Maximise XOR */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaximiseXOR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-- > 0){
		    String a = sc.next();
		    String b = sc.next();
		    int a0 = count(a,'0');
		    int a1 = count(a,'1');
		    int b0 = count(b,'0');
		    int b1 = count(b,'1');
		    int len = Math.min(a0,b1) + Math.min(a1,b0);
		    System.out.println("1".repeat(len) + "0".repeat(a.length() - len));
		    
		}
	}
	public static int count(String a, char st){
	    int c = 0;
	    for(int i=0 ; i<a.length() ; i++){
	        if(a.charAt(i)==st)
	         c++;
	    }
	    return c;
	}
}
