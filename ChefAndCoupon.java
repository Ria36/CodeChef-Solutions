/* https://www.codechef.com/problems/COUPON2 */
/* Chef and Coupon */

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
		Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0){
	    int d=sc.nextInt();
	    int c=sc.nextInt();
	    int A[]=new int[3];
	     int B[]=new int[3];
	     int sum1=0,sum2=0;
	     for(int i=0;i<3;i++){
	         A[i]=sc.nextInt();
	         sum1=sum1+A[i];
	        
	     } 
	     for(int i=0;i<3;i++){
	         B[i]=sc.nextInt();
	         sum2=sum2+B[i];
	     }
	    int withCouponCost=(sum1>=150?sum1:sum1+d)+(sum2>=150?sum2:sum2+d)+c;
	     int withoutcoupon=sum1+sum2+2*d;
	     //int withCouponCost=(day1cost>=150?day1cost:day1cost+d)+(day2cost>=150?day2cost:day2cost+d)+c;
	     // int withoutCouponCost=day1cost+day2cost+2*d;
		    
	     if(withCouponCost<withoutcoupon){
	     System.out.println("YES");
	     }
	     else{
	         System.out.println("NO");
	     }
	    t--;
	}
	}
}
