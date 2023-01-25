/* Devu and friendship testing */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DevuAndFriendshipTesting
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[101];
		    int count = 0;
		    for(int i=0;i<n;i++)
		    a[sc.nextInt()]++;
		    for(int i=1;i<101;i++)
		    {
		        if(a[i]>0)
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
