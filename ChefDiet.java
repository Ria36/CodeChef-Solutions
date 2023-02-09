/* Chef Diet */
/* https://www.codechef.com/problems/DIET */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefDiet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int nDays = sc.nextInt();
		    int kGrams = sc.nextInt();
		    int arr[] = new int[nDays];
		    for(int i=0;i<nDays;i++){
		        arr[i] = sc.nextInt();
		    }
		    int s=0,trig=0;
            for(int i=0;i<arr.length;i++)
            {
               if(arr[i]+s<kGrams)
               {
                   trig=1;
                   System.out.println("NO "+(i+1));
                   break;
               }
               else 
               {
                   s+=arr[i]-kGrams;
               }
           }
           if(trig==0)
           System.out.println("YES");
           
           t--;
		}
	}
}
