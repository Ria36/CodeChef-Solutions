/* https://www.codechef.com/problems/CHEFROUT */
/* Chef and his daily routine */

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
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		while(n-->0)
        {
        String str=input.next();
        int flag=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i+1)<str.charAt(i)){
                System.out.println("no");
                flag=0;
                break;
            }
        }
    
    if(flag==1){
        System.out.println("yes");
    }
    }
	}
}
