/* https://www.codechef.com/problems/DISABLEDKING */
/* Disabled King */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DisabledKing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    int n=sc.nextInt();
		    if((n&1) == 0){
		        System.out.println(n);
		    }
		    else{
		        System.out.println(n-1);
		    }
		    t-=1;
		}
	}
}
