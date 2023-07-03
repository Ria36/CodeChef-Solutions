/* https://www.codechef.com/problems/CHEALG */
/* Check Algorithm */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckAlgorithm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    while(t-- >0){
	       String S = input.next();
	       StringBuilder br = new StringBuilder();
	       int count = 0;
	       char a = S.charAt(0);
	       for(int i = 0; i<S.length(); i++){
	           char c = S.charAt(i);
	           if(a == c ){
	               count++;
	           }else if(a != c || i == S.length()){
	                br.append(a);
	                br.append(count);
	                a = S.charAt(i);
	                count = 1;
	           }
	       }
	       br.append(a);
	       br.append(count);
    	   String A = br.toString();
    	   if(S.length() > A.length()){
    	       System.out.println("YES");
    	   }else{
    	       System.out.println("NO");
    	   }
	    }
	}
}
