/* https://www.codechef.com/problems/MINORMAX */
/* Minimum or Maximum */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinimumOrMaximum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0 ){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for (int i = 0 ; i < n ; i++ ) 
		    a[i] = sc.nextInt();
		    int min = Integer.MAX_VALUE;
		    int max = Integer.MIN_VALUE;
		    boolean flag = true;
		    for( int i = 0 ; i < n ; i++ ){
		        
		        if( a[i] > max ){
		            max = a[i];
		        }
		        if( a[i] < min ){
		            min = a[i];
		        }
		        if( a[i] != min && a[i] != max ){
		            flag = false;
		        }
		    }
		    
		    if(flag ){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
