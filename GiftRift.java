/* https://www.codechef.com/problems/SAD */
/* Gift Rift */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GiftRift
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		for(int j=0;j<c;j++)
		arr[i][j]=sc.nextInt();
		
		
		int [] arr1=new int[r];
		int [] arr2=new int[c];
		for(int i=0;i<r;i++){
		    int max=Integer.MAX_VALUE;
		    for(int j=0;j<c;j++){
		        max=Math.min(arr[i][j],max);
		    }
		    arr1[i]=max;
		}
		for(int i=0;i<c;i++){
		    int max=Integer.MIN_VALUE;
		    for(int j=0;j<r;j++){
		        max=Math.max(arr[j][i],max);
		    }
		    arr2[i]=max;
		}
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:arr1){
		    map.put(i,map.getOrDefault(i,0)+1);
		}
		boolean f=true;
		for(int i:arr2){
		    if(map.containsKey(i))
		    {
		        System.out.println(i);
		        f=false;
		        break;
		    }
		}
		if(f)
		System.out.println("GUESS");
	}
}

