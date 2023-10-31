/* Covid Spread */
/* https://www.codechef.com/problems/COVSPRD */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CovidSpread
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int p=sc.nextInt();
		    int c=sc.nextInt();
		    int m=1;
		        for(int a=1;a<=c;a++){
		            if(a<=10){
		                 m=2*m;
		                 if(m>p){
		                     m=p;
		                     break;
		                 }
		            }else{
		                m=3*m;
		                 if(m>p){
		                     m=p;
		                     break;
		                 }
		            }
		        }
		        System.out.println(m);
		    }
	}
}
