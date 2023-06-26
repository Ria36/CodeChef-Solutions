/* https://www.codechef.com/problems/MINFD */
/* Chef and Fixed Deposits */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndFixedDeposits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		 Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr []= new int[n];
            int count =0;
            int a=0,sum=0;
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=n-1;i>=0;i--){
                sum+=arr[i];
                count++;
                if(sum>=x){
                    a=1;
                    System.out.println(count);
                    break;
                }
            }
            if(a==0){
                System.out.println(-1);
            }
        }
	}
}
