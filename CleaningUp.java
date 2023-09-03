/* https://www.codechef.com/problems/CLEANUP */
/* Cleaning Up */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CleaningUp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    HashSet<Integer> set=new HashSet<>();
		    while(m-->0) set.add(sc.nextInt());
		    Vector<Integer> chef=new Vector<>();
		    Vector<Integer> assistant=new Vector<>();
		    boolean isChef=true;
		    for(int i=1;i<=n;i++){
		        if(!set.contains(i)){
		            if(isChef) {chef.add(i);isChef=!isChef;}
		            else {assistant.add(i);isChef=!isChef;}
		        }
		    }
		    if(chef.isEmpty()) System.out.println(-1);
		    else{
		        for(int i=0;i<chef.size();i++) System.out.print(chef.get(i)+" ");
		        System.out.println();
		    }
		    if(assistant.isEmpty()) System.out.println(-1);
		    else{
		        for(int i=0;i<assistant.size();i++) System.out.print(assistant.get(i)+" ");
		        System.out.println();
		    }
		}
	}
}
