/* https://www.codechef.com/problems/SWAPCW */
/* Swapping Chefs Way */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SwappingChefsWay
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int j=0;j<t;j++){
	    int w=0;
	   int g=sc.nextInt();
	   sc.nextLine();
	   String c=sc.nextLine();
	   char[]new1=c.toCharArray();
	   lab:for(int k=0;k<g;k++){
	       char[] new2=c.toCharArray();
	           Arrays.sort(new2);
	       if(Arrays.equals(new1,new2)){
	           System.out.println("YES");
	           break lab;
	       }
	       else{
	           w+=1;
	       }
	       if(new1[k]>new1[g-k-1]){
	           char v=new1[k];
	           new1[k]=new1[g-k-1];
	           new1[g-k-1]=v;
	       }
	       //w+=1;
	       
	   }
	   if(w==g){
	       System.out.println("NO");
	   }
	}
	}
}

