/* https://www.codechef.com/problems/BROKPHON */
/* Broken Telephone */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BrokenTelephone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int count = 0;
		    for(int i=0; i<n; i++){
		        if(i==0){              //first element
		           if(arr[i]!=arr[i+1]){
		               count++;
		           }
		        }
		        
		        else if(i==n-1){           //last element
		            if(arr[i]!=arr[i-1]){
		                count++;
		            }
		           
		        }
		        else if(arr[i]!=arr[i-1] || arr[i]!=arr[i+1]){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
