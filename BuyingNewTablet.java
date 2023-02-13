/* https://www.codechef.com/problems/TABLET */
/* Buying New Tablet */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BuyingNewTablet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int b=sc.nextInt();
		    int[][] arr=new int[n][3];
		    int max=0;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<3;j++){
                    arr[i][j]=sc.nextInt();
                }
                if((arr[i][0]*arr[i][1])>max && arr[i][2]<=b){
                    max=arr[i][0]*arr[i][1];
                }
            
		    }
		    if(max==0){
		        System.out.println("no tablet");
		    }
		    else{
		        System.out.println(max);
		    }
	    }
	}
}
