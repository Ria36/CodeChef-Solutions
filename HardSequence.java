/* https://www.codechef.com/problems/HRDSEQ */
/* Hard Sequence */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HardSequence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner scn  = new Scanner(System.in);
		int tc = scn.nextInt();
		
		while(tc-- > 0){
		    int n = scn.nextInt();
		    
		    int arr[] = new int[129];
		    
		    arr[1] = 0;
		    
		    int vis[] = new int[256];
		    
		    for(int i = 0; i < 256; i++){
		        vis[i] = 0;
		    }
		    
		    for(int i = 2; i < 129; i++){
		        if(vis[arr[i - 1]] != 0){
		            arr[i] = (i - 1) - vis[arr[i - 1]];
		          
		        } else {
		            arr[i] = 0;
		        }
		          vis[arr[i - 1]] = i - 1;
		    }
		    
		    int count = 0;
		    for(int i = 1; i <= n; i++){
		        if(arr[i] == arr[n]){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
