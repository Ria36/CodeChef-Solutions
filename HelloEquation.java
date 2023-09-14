/* https://www.codechef.com/problems/HLEQN */
/* Hello Equation */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HelloEquation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		while(t>0) {
		    int x= in.nextInt();
		    
		    boolean flag=false;
		    
		    for(int i=1 ; i< Math.sqrt(x) ; i++) {
		        if((x-(i*2))%(2+i)==0 && x!=2*i)
		            flag=true;
		    }
		    
		    if(flag)
		        System.out.println("yes");
		    else
		        System.out.println("no");
		    t--;
		}
	}
}
