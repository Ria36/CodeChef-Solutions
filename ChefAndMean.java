/* https://www.codechef.com/problems/CHFM */
/* Chef and Mean */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndMean
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    long sum = 0;
		    for(int j=0;j<n;j++){
		        arr[j] = sc.nextInt();
		        sum += arr[j];
		    }
		    long a = sum/n;
		    long ans = -1;
		    for(int j=0;j<n;j++){
		        if(a==arr[j]){
		            ans = j+1;
		            break;
		        }
		    }
		    if(ans == -1 || sum%n!=0){
		        System.out.println("Impossible");
		    }
		    else{
		        System.out.println(ans);
		    }
		    
		}
	}
}
