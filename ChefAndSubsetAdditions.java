/* https://www.codechef.com/problems/SUBSTADD */
/* Chef and Subset Additions */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndSubsetAdditions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int size = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int a[] = new int[size];
		    int b[] = new int[size];    
		    for(int i=0;i<size;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<size;i++){
		        b[i]=sc.nextInt();
		    }
		    int i=0;
		    for(;i<size;i++){
		        if(b[i]-a[i]!=x && b[i]-a[i]!=y){
		            System.out.println("no");
		            break;
		        }
		    }
		    if(i==size)
		    System.out.println("yes");
		}
	}
}
