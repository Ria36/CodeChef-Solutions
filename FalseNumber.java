/* https://www.codechef.com/problems/FALSNUM */
/* False Number */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FalseNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    String str=sc.next();
	    int len=str.length();
        if(str.charAt(0)!='1'){
	      str="1"+str; 
	    }
	    else{
	        str="1"+"0"+str.substring(1,len);
	    }
	    System.out.println(str);
	}
	}
}
