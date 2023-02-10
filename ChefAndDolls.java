/* https://www.codechef.com/problems/MISSP */
/* Chef and Dolls */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndDolls
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int m=0; m<n; m++){
		    int size = sc.nextInt();
		    int arr[] = new int[size+1];
		    for(int i=0; i<size; i++){
		        arr[i] = sc.nextInt();
		    }	    
		    Arrays.sort(arr, 0, size);		    
		    for(int j=0; j<size+1; j+=2){        
		        if(arr[j]!= arr[j+1]){
		            System.out.println(arr[j]);
		            break;
		        }		        
		    }		    
		}
	}
}
