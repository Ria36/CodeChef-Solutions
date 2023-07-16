/* https://www.codechef.com/problems/TWOSTR */
/* Chef and the Wildcard Matching */

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
			Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String X = sc.next();
            String Y = sc.next();
            boolean res = true;

            for(int i=0,j=0;i<X.length() || j<Y.length();i++,j++){
                if(X.charAt(i)==Y.charAt(j) || X.charAt(i)=='?' || Y.charAt(j)=='?'){
                    res = true;
                }

                else{
                    res = false;
                   // System.out.println("No");
                    break;
                }
            }
            if(res==true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
	}
}
