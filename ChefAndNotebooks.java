/* https://www.codechef.com/problems/CNOTE */
/* Chef and Notebooks */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndNotebooks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = sc.nextInt();;
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		while(t-->0){
		  boolean flag=false;
          if(b>=a){
            flag=true;
          }
          for(int i=0;i<d;i++){
            int pages=sc.nextInt();
            int price=sc.nextInt();
            if(price<=c && pages+b>=a){
                flag =true;
            }
          }
          if(flag){
            System.out.println("LuckyChef");
          }
          else{
            System.out.println("UnluckyChef");
          }
		}
	}
}
