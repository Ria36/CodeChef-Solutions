/* https://www.codechef.com/problems/PAIRPAIN */
/* Pair Pain */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PairPain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int len = sc.nextInt(), arr[] = new int[len];
            long one = 0,two = 0, res = 0;
            for(int i = 0; i < len; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 1)one++;
                else if(arr[i] == 2) two++;
            }
            while(one-- > 0){
                res += --len;
            }
            res += (two*(two-1))/2;
            System.out.println(res);
		}
	}
}
