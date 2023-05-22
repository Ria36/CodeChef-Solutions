/* https://www.codechef.com/problems/CRDGAME3 */
/* Another Card Game Problem */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AnotherCardGameProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = a/9;
		    int d = b/9;
		    if(a%9!=0){
		        c++;
		    }
		    if(b%9!=0){
		        d++;
		    }
		    if(c==d){
		        System.out.println(1+" "+d);
		    }
		    else if(d>c){
		         System.out.println(0+" "+c);
		    }
		    else{
		        System.out.println(1+" "+d);
		    }
		}
	}
}

