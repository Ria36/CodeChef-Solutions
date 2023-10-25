/* https://www.codechef.com/problems/REACTION */
/* Chain Reaction */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChainReaction
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,i,j,k,l,f,m,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0){
		    n = sc.nextInt();
		    m = sc.nextInt();
		    int ar[][] = new int[n][m];
		    for(i = 0; i<n; i++){
		        for(j = 0; j<m; j++)
		            ar[i][j] = sc.nextInt();
		    }
		    f = 1;
		    for(i= 0; i<n; i++){
		        for(j = 0; j<m; j++){
		            if((i == 0&&j == 0)||(i == 0&&j == m-1)||(i == n-1&&j == m-1)||(i == n-1 && j == 0)){
		                if(ar[i][j]>1){
		                    f = 0;
		                    break;
		                }
		            }
		                else if(((i == 0 || i == n-1) && j>0 && j<m-1)||((j == 0||j == m-1) && i>0 && i<n-1)){
		                    if(ar[i][j]>2){
		                        f = 0;
		                        break;
		                    }
		                }
		                else{
		                    if(ar[i][j]>3){
		                        f = 0;
		                        break;
		                    }
		                }
		        }
		        if(f == 0)
		            break;
		    }
		    if(f == 1)
		        System.out.println("Stable");
		    else System.out.println("Unstable");
		}
	}
}
