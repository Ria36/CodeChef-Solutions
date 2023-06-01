/* https://www.codechef.com/problems/VILLINE */
/* Recruit Villagers */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RecruitVillagers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int c=s.nextInt();
		int power1=0;
		int power2=0;
		for(int i=0;i<n;i++){
		    int x=s.nextInt();
		    int y=s.nextInt();
		    int p=s.nextInt();
		    int ans=m*x+c;
		    if(y>ans){
		        power1+=p;
		    }else{
		        power2+=p;
		    }
		}
		System.out.println(Math.max(power1,power2));
	}
}
