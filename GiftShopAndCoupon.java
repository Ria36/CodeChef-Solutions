/* Gift Shop and Coupon */
/* https://www.codechef.com/LP1TO205/problems/GFTSHP */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GiftShopAndCoupon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x;
		while(t-->0){
		    int items = sc.nextInt();
		    int chefMoney = sc.nextInt();
		    int[] itemsCost = new int[items];
		    
		    for(int i=0;i<items;i++){
		        itemsCost[i]=sc.nextInt();
		    }
		    
		    Arrays.sort(itemsCost);
		    int count = 0,sum = 0;
		    
		    for(int i=0;i<items;i++){
		        x=itemsCost[i]/2;
		        if(itemsCost[i]%2==1)
		        x+=1;
		        if(sum+x<=chefMoney){
		            sum+=itemsCost[i];
		            count++;
		        }
		        else{
		            break;
		        } 
		    }
		    
		    System.out.println(count);
		}
	}
}
