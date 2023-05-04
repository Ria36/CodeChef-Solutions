/* https://www.codechef.com/problems/GARDENSQ */
/* Garden Squares */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GardenSquares
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt(),m=s.nextInt();
		    String[] a=new String[n];
		    int c=0;
		    for(int i=0;i<n;i++)a[i]=s.next();
		    for(int i=0;i<n;i++){
		        for(int j=0;j<m;j++){
		            for(int k=1;k+i<n&&k+j<m;k++){
		                char l=a[i].charAt(j);
		                char m1=a[i+k].charAt(j);
		                char n1=a[i].charAt(j+k);
		                char o=a[i+k].charAt(j+k);
		                if(l==m1&m1==n1&n1==o)c++;
		            }
		        }
		    }
		    System.out.println(c);
		}
	}
}

