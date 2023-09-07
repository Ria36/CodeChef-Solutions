/* https://www.codechef.com/problems/CHEFRP */
/* Chef and new recipe */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndNewRecipe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int [] arr=new int[N];
		    for(int i=0;i<N;i++) arr[i]=sc.nextInt();
		    
		    Arrays.sort(arr);
		    int sum=0;
		    if(arr[0]<2) System.out.println(-1);
		    else if(N==1) System.out.println(2);
		    else{
		        for(int i=N-1;i>=1;i--){
		            sum+=arr[i];
		        }
		        sum+=2;
		        
		        System.out.println(sum);
		    }
		}
	}
}
