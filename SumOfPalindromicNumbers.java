/* Sum of palindromic numbers */
/* https://www.codechef.com/problems/SPALNUM */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int l = sc.nextInt();
		    int r = sc.nextInt();
		    int sum = 0;
		    for(int i=l; i<=r; i++){
		        int num = i;
		        int rev=0;
		        while(num!=0){
		            rev = rev*10 + num%10;
		            num /= 10;
		        }
		        if(rev == i){
		            sum += rev;
		        }
		    }
		    System.out.println(sum);
	    }
	}
}
