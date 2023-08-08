/* https://www.codechef.com/problems/CHEFLUCK */
/* Lucky lucky number */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LuckyLuckyNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int s=0;s<n;s++){
	    int x=sc.nextInt();
	    boolean status=false;
	    for(int j=x;j>=0;j=j-4){
	         if(j%7==0){System.out.println(j);status=true;break;}
	    }
	    if(status==false){System.out.println(-1);}
	}
	}
}

