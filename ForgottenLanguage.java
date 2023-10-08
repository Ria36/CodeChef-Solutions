/* https://www.codechef.com/problems/FRGTNLNG */
/* Forgotten Language */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ForgottenLanguage
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		int n=s.nextInt();
		int k=s.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.next();
		}
		HashMap<String,Integer>map=new HashMap<>();
		for(int i=1;i<=k;i++){
		    int a=s.nextInt();
		    for(int j=1;j<=a;j++){
		        String ans=s.next();
		        map.put(ans,1);
		    }
		}
		for(int i=0;i<n;i++){
		    if(map.containsKey(arr[i])){
		        System.out.print("YES"+" ");
		    }else{
		        System.out.print("NO"+" ");
		    }
		}
		System.out.println();
		}
	}
}
