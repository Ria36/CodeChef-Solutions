/* https://www.codechef.com/problems/PERMGCD */
/* Permutation GCD */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PermutationGCD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x>y){
		        System.out.println(-1);
		    }
		    else{
		        int num=y-x+1;
		        System.out.print(num+" ");
		        for(int i=1;i<=x;i++){
		            if(i==num) continue;
		            System.out.print(i+" ");
		        }
		        System.out.println();
		    }
		    
		}
	}
}
