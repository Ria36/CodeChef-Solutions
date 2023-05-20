/* https://www.codechef.com/problems/MODEFREQ */
/* Mode of Frequencies */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ModeOfFrequencies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[10];
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++){
		        a[sc.nextInt()-1]++;
		    }
		    int max=0,maxcurr=0;
		    for(int i=0;i<10;i++){
		        if(a[i]>0){
		            if(map.containsKey(a[i])){
		            Integer b=map.get(a[i]);
		            b++;
		            map.put(a[i],b);
		        }else{
		            map.put(a[i],1);
		        }
		        Integer b=map.get(a[i]);
		        if(max==b){
		            maxcurr=Math.min(maxcurr,a[i]);
		        }else{
		            if(b>max){
		                max=b;
		                maxcurr=a[i];
		            }
		        }
		        }
		    }
		    System.out.println(maxcurr);
		}
	}
}
