/* https://www.codechef.com/problems/S02E10 */
/* The One with Russ */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TheOneWithRuss
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while(t-->0){
		    int n = inp.nextInt();
		    int x = inp.nextInt();
		    int k = inp.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    for(int i=0; i<n; i++){
		        a[i] = inp.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        b[i] = inp.nextInt();
		    }
		    int count = 0;
		    for(int i=0; i<n; i++){
		        if(Math.abs(a[i]-b[i])<=k){
		            count++;
		        }
		    }
		    if(count>=x){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
