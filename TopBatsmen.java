/* Top Batsmen */
/* https://www.codechef.com/problems/BESTBATS */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++)f*=i;
        return f;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t>0){
		    Integer[] a=new Integer[11];
		    for(int i=0;i<11;i++)a[i]=scan.nextInt();
		    int k=scan.nextInt();
		    Arrays.sort(a,Collections.reverseOrder());
		    int count=0,count1=0;int num=a[k-1];
		    for(int i=0;i<11;i++){
		        if(a[i]==num)count++;
		    }
		    for(int i=0;i<k;i++){
		        if(a[i]==num)count1++;
		    }
		    int result=(factorial(count)/((factorial(count-count1))*factorial(count1)));
		    System.out.println(result);
		    t--;
		}
	}
}
