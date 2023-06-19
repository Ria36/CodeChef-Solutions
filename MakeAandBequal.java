/* Make A and B equal */
/* https://www.codechef.com/problems/MAKEABEQUAL */

/* package codechef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeAandBequal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    long x=0;
		    long y=0;
		    int n =sc.nextInt();
		    int[] A =new int[n];
		    int[] B = new int[n];
		    for(int i =0;i<A.length;i++){
		        A[i]=sc.nextInt();
		    }
		    for(int i =0;i<B.length;i++){
		        B[i]=sc.nextInt();
		        x = x+(A[i]-B[i]);
		        y = y+Math.abs(A[i]-B[i]);
		    }
		    if(x!=0){
		        System.out.println(-1);
		    }else if(y%2!=0){
		        System.out.println(-1);
		    }else{
		        System.out.println(y/2);
		    }
		}
	}
}
