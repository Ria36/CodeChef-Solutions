/* https://www.codechef.com/problems/CHEFCHR */
/* Chef And His Characters */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndHisCharacters
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String s=sc.next();
		    int ans=0;
		    for(int i=0;i<s.length()-3;i++){
		        String sub=s.substring(i,i+4);
		        if(sub.contains("c") && sub.contains("h") && sub.contains("e") && sub.contains("f"))
		        ans++;
		    }
		    if(ans==0){
		        System.out.println("normal");
		    }
		    else{
		        System.out.println("lovely "+ans);
		    }
		}
	}
}
