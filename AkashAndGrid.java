/* https://www.codechef.com/problems/CHEFGRD */
/* Akash and Grid */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AkashAndGrid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1;i<=t ;i++ ){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x%2==0 && y%2!=0){
		        System.out.println(1);
		    }
		    else if (y%2==0 && x%2!=0){
		        System.out.println(1);
		    } 
		    else{
		        System.out.println(0);
		    }
		} 
	}
}
