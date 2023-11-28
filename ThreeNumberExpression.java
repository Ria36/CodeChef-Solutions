/* Three Number Expression */
/* https://www.codechef.com/practice/course/interview-dsa/DSAPREP_01/problems/EXPRESSION_3?tab=statement */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		long a,b,c;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++){
		    a=sc.nextLong();
		    b=sc.nextLong();
		    c=sc.nextLong();
		    if((a+b)==c){
		        System.out.println("Yes");
		    }else if((a+c)==b){
		        System.out.println("Yes");
		    }else if((b+c)==a){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
