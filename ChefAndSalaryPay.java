/* https://www.codechef.com/problems/HCAGMAM1 */
/* Chef And Salary Pay */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndSalaryPay
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    String s=sc.next();
		    int c=0;
		    int count=0;
		    int max=0;
		    for(int i=0;i<s.length();i++){
		        char ch=s.charAt(i);
		        if(ch == '1'){
		            count++;
		            c++;
		            if(c>=max)
		            max=c;
		        }
		        else{
		            
		            c=0;
		        }
		    }
		    int sum=count*x+max*y;
		    System.out.println(sum);
		}
	}
}

