/* Vaccine Dates */
/* https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/VDATES */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VaccineDates
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int d=sc.nextInt();
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    
		    if(d>r){
		        System.out.println("Too Late");
		    }else if(d<l){
		        System.out.println("Too Early");
		    }else{
		        System.out.println("Take second dose now");
		    }
		}
	}
}
