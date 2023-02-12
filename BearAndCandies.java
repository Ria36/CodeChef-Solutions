/* https://www.codechef.com/problems/CANDY123 */
/* Bear and Candies 123 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BearAndCandies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int A_Candies = sc.nextInt();
		    int B_Candies = sc.nextInt();
		    int limak = 0;
		    int bob = 0;
		    while(A_Candies>=0 && B_Candies>=0){
		        limak=bob+1;
		        bob=limak+1;
		        A_Candies=A_Candies-limak;
		        B_Candies=B_Candies-bob;
		        if(A_Candies<0){
		            System.out.println("Bob");
		            break;
		        }
		        if(B_Candies<0){
		        System.out.println("Limak");
		        break;
		        }
		    } 
		}
	}
}
