/* https://www.codechef.com/problems/MSTEP */
/* Count Steps in Matrix */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CountStepsInMatrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=null;
		int t;
		int n;
		int[] a=new int[250005];
		int[] b=new int[250005];
		int temp;
		try{
			sc=new Scanner(System.in);
			t=sc.nextInt();
			
			while(t>0){
				
				n=sc.nextInt();
				for(int i=1;i<=n;i++){
					
					for(int j=1;j<=n;j++){
						
						temp=sc.nextInt();
						a[temp]=i;
						b[temp]=j;
					}
				}
				
				System.out.println(solve(a,b,n));
				t--;
			}
		}
		finally{
			
			if(sc!=null)
				sc.close();
		}

	}
	public static long solve(int[] a,int[] b,int n){
		
		long d=0;
		for(int i=1;i<n*n;i++){
			
			d+= distance(a,b,n,i);
			
		}
		return d;
	}
	public static int distance(int[] a,int[] b,int n,int i){
		
		return Math.abs(a[(int) i]-a[(int) (i+1)]) + Math.abs(b[(int) i]-b[(int) (i+1)]);
	}
}

