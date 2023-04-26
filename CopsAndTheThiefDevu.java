/* https://www.codechef.com/problems/COPS */
/* Cops and the Thief Devu */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CopsAndTheThiefDevu
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t-->0){
		     int n=sc.nextInt();
		     int x=sc.nextInt();
		     int y=sc.nextInt();
		     int a=x*y;
		     int[]arr=new int[n];
		     int[]h=new int[101];
		     for(int i=0;i<n;i++){
		         arr[i]=sc.nextInt();
		         int min=arr[i]-a;
		         if(min<1){
		             min=1;
		         }
		         int max=arr[i]+a;
		         if(max>100){
		             max=100;
		         }
		         for(int k=min;k<=max;k++){
		             h[k]=1;
		         }
		     }
		     int count=0;
		     for(int i=0;i<h.length;i++){
		         if(h[i]==0){
		             count++;
		         }
		     }
		     System.out.println(count-1);
		 }
	}
}
