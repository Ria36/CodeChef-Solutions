/* https://www.codechef.com/problems/REDALERT */
/* Red Alert */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
		    int n = scn.nextInt();
		    int d = scn.nextInt();
		    int h = scn.nextInt();
		    
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++){
		        arr[i] = scn.nextInt();
		    }
		    
		    boolean flag = false;
		    int wl = 0;
		    for(int i = 0; i < n && !flag; i++){
		        int rain = arr[i];
		        if(rain > 0){
		            wl += rain;
		        }
		        else {
		            if(wl <= d) wl = 0;
		            else wl -= d;
		        }
		        
		        if(wl > h) flag = true;
		        
		    }
		    
		    System.out.println(flag ? "YES" : "NO");
		}
	}
}

