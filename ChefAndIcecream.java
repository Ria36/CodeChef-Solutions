/* https://www.codechef.com/problems/CHFICRM */
/* Chef and Icecream */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
	    int t = scn.nextInt();
		for(int j=0;j<t;j++){
		    int n = scn.nextInt();
		    int [] arr = new int [n];
		    for(int i=0;i<n;i++){
		        arr[i]=scn.nextInt();
		    }
		    int k=0;
		    int count5=0;
		    int count10=0;
		    boolean c = true;
		    while(k<arr.length){
		        int a = arr[k];
		        if(a==5)count5++;
		        else if(a==10){
		            if(count5==0){
		                c=false;
		                break;
		            }
		            count10++;
		            count5--;
		        }
		        else{
		            
		            if(count10!=0)count10--;
		            else if(count5>1)count5=count5-2;
		            else{
		                c=false;
		                break;
		            }
		            
		        }
		        k++;
		    }
		    if(c)System.out.println("YES");
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
