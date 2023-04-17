/* https://www.codechef.com/problems/HOWMANYMAX */
/* How Many Maximums */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HowManyMaximums
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    int count = 0;
		    if(s.charAt(0)=='1') 
		    count++;
		    if(s.charAt(n-2)=='0') 
		    count++;
		    for(int i=0;i<n-2;i++){
		        if((s.charAt(i)=='0')&&(s.charAt(i+1)=='1')) 
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
