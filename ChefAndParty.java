/* https://www.codechef.com/problems/CHFPARTY */
/* Chef and Party */

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
		int T = sc.nextInt();
		while(T-->0){
		    int N = sc.nextInt();
		    int[] arr = new int[N];
		    
		    
		    for(int i=0; i<N; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    
		    int count =0;
		    for(int i=0; i<N; i++){
		        if(arr[i]==0){
		            count++;
		        }else if(count>=arr[i]){
		            count++;
		        }else{
		            break;
		        }
		    }
		    System.out.println(count);
		    
		}
	}
}
