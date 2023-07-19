/* https://www.codechef.com/problems/STICKS */
/* Sticks */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sticks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0){
		    int n=kb.nextInt();
		    int [] arr=new int[n];
		    for(int i=0;i<arr.length;i++)
		      arr[i]=kb.nextInt();
		    Arrays.sort(arr);
		    int sideOne=0,sideTwo=0;
		    for(int i=arr.length-1;i>0;i--){
		       if(sideOne==0 &&(arr[i])==arr[i-1]){
		           sideOne=arr[i];
		           i--;
		       }else if(sideTwo==0 &&(arr[i]==arr[i-1])){
		           sideTwo=arr[i];
		           i--;
		       }
		    }
		    if(sideOne!=0&&sideTwo!=0){
		        System.out.println(sideTwo*sideOne);
		    }else{
		        System.out.println(-1);
		    }
		}
	}
}
