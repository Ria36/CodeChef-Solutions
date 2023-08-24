/* https://www.codechef.com/problems/ANTIPAL */
/* Chef and Pal */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndPal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    if(a%2!=0){
		        System.out.println(-1);
		    }
		    else{
		        for(int i=1;i<=a;i++){
		            if(i>a/2){
		                System.out.print('0');
		            }
		            else{
		                System.out.print('1');
		            }
		        }
		    }
		    System.out.println();
		}
	}
}

