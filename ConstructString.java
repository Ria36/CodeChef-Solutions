/* https://www.codechef.com/problems/CONSTR */
/* Construct String */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ConstructString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		    int n = sc.nextInt();
		    String u = sc.next();
		    char ch = u.charAt(0);
		    
		    int count = 0;
		    
		    
		    for(int i=1; i<n; i++){
		        if(u.charAt(i)==u.charAt(i-1)){
		            count++;
		        } else {
		            if(count%2==0){
		                System.out.print(ch);
		            } else {
		                System.out.print(ch);
		                System.out.print(ch);
		            }
		            count=0;
		            ch = u.charAt(i);
		        }
		    }
		    if(count%2==0){
		        System.out.print(ch);
		    } else {
		        System.out.print(ch);
		        System.out.print(ch);
		    }
		    System.out.println();
		    
		} 
	}
}
