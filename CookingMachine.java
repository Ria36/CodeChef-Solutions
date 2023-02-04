/* Cooking Machine */
/* https://www.codechef.com/LP1TO205/problems/COOKMACH */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CookingMachine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a==b){
		        System.out.println("0");
		        continue;
		    }
		    int count=0;
		    while(b%a!=0){
		        a=a/2;
		        count++;
		    }
		    while(b!=a){
		        a=a*2;
		        count++;
		    }
		    System.out.println(count);
		}
	}
}

 
