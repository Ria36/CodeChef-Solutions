/* https://www.codechef.com/problems/DOUBLEDDIST */
/* Doubled Distances */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t--!=0){
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }
	        Arrays.sort(a);
	        boolean f = true;
	        for(int i=1;i<n-1;i++){
	            int x=a[i]-a[i-1];
	            int y=a[i+1]-a[i];
	            if(x!=2*y && 2*x!=y){
	                f=false;
	            }
	        }
	        if(f){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	        
	    }
	}
}
