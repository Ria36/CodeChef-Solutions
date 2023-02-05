/* Pushpa - PUSH7PA */
/* https://www.codechef.com/LP1TO205/problems/PUSH7PA */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pushpa
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int towers = sc.nextInt();
		    int[] towerHeight = new int[towers];
		    
		    for(int i=0;i<towers;i++){
		        towerHeight[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(towerHeight);
		    if(towers==1){
		        System.out.println(towerHeight[0]);
		    }
		    else{
		        long count=0,sum=0;
		        for(int i=towers-1;i>=1;i--){
		            if(towerHeight[i]==towerHeight[i-1]){
		                count++;
		            }
		            else{
		                if(sum<towerHeight[i]+count){
		                    sum=towerHeight[i]+count;
		                }
		                count=0;
		            }
		        }
		        System.out.println(sum);
		    }
		}
	}
}
