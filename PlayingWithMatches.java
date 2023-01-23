/* Playing with Matches */
/* https://www.codechef.com/LP1TO205/problems/MATCHES */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PlayingWithMatches
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int result = a+b;
		    Dictionary<Integer,Integer> dict=new Hashtable<Integer,Integer>();
		    dict.put(0,6);
		    dict.put(1,2);
		    dict.put(2,5);
		    dict.put(3,5);
		    dict.put(4,4);
		    dict.put(5,5);
		    dict.put(6,6);
		    dict.put(7,3);
		    dict.put(8,7);
		    dict.put(9,6);
		    int c=0;
		    while(result>0){
		        int num=result%10;
		        result=result/10;
		        c=c+dict.get(num);
		    }
		    System.out.println(c);
		}
	}
}
