/* https://www.codechef.com/problems/OJUMPS */
/* Chef-jumping9+ */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		long a = scan.nextLong();
		if(a==0){
		    System.out.print("yes");
		}
		else if(a%6==1||a%3==0){
		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}
	}
}
