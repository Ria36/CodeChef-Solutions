/* https://www.codechef.com/problems/CHAIRS_ */
/* Chairs Requirement */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChairsRequirement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		for(int i = 0;i<t;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    if(a>b){
		        int res=a-b;
		        System.out.println(res);
		    }
		    else
		        System.out.println("0");
		}
	}
}
