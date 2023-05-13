/* https://www.codechef.com/problems/AMSGAME1 */
/* Subtraction Game 1 */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SubtractionGame1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    int b=0;
		    for(int i=0;i<n;i++){
		        b=gcd(b,a[i]);
		    }
		    System.out.println(b);
		}
	}
	static int gcd(int a,int b){
	    if (b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
	}
}
