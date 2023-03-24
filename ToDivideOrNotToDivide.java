/* https://www.codechef.com/problems/DIVAB */
/* To Divide or Not To Divide */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ToDivideOrNotToDivide
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    long n = sc.nextLong();
		    
		    if(a%b==0){
		        System.out.println(-1);
		    }else{
		        long num = 0;
		        num = n/a;
		        if(n%a!=0){
		            num++;
		        }
		        num = a*num;
		        if(num%b==0){
		            System.out.println(num+a);
		        }else{
		            System.out.println(num);
		        }
		        
		    }
		    
		}
	}
}
