/* https://www.codechef.com/problems/BALLOON */
/* ICPC Balloons */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ICPCBalloons
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int count = 0;
		    
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		        if(a[i]>=1 && a[i]<=7){
		            count=i+1;
		        }
		    }
		    System.out.println(count);
		}
	}
}
