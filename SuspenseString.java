/* https://www.codechef.com/problems/SUSSTR */
/* Suspense String */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int l = sc.nextInt();
		    String S = sc.next();
		    String T = "";
		    int count =0;
		    while(!S.isEmpty()){
		        
		       if (count%2 ==0){
		        //alice turn       make string smallest
 
		      char c = S.charAt(0);
		      T= c=='0'?c+T :T+c  ;
		      S= S.substring(1);
		      count++;
		      
		    }
		    else{  //bob turn make string biggest
		        char c = S.charAt(S.length()-1);
		      T=  (c =='0' )? T+c :c+T;
		      S=  S.substring(0,S.length()-1);
		        count++;
		    }
		    
		    }
		    System.out.println(T);
		}
	}
	
	public static int binarytodecimal(String binary){
	    int value = Integer.parseInt(binary,2);
	    return value;
	}
}
