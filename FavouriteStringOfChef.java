/* https://www.codechef.com/problems/CHEFFAV */
/* Favourite String of Chef */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FavouriteStringOfChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for (int i=0;i<T;i++){
		    int N=sc.nextInt();
		    sc.nextLine();
		    String S=sc.nextLine();
		    int a=S.indexOf("code");
		    int b=S.indexOf("chef");
		    if(a<b){
		        System.out.println("AC");
		    }else{
		        System.out.println("WA");
		    }  
		}
	}
}

