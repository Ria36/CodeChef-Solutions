/* https://www.codechef.com/problems/ICL1801 */
/* Matrix Game */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MatrixGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int swims = scan.nextInt();
		for(int i = 0; i<swims;i++){
			int Cyborg = 0;
			int Geno = 0;
			int k = scan.nextInt();
			int b = scan.nextInt();
			Integer[] arr = new Integer[k*b];
			for(int h =0;h<arr.length;h++){
				arr[h] = scan.nextInt();
			}
			Arrays.sort(arr,Collections.reverseOrder());
			for(int h = 0;h<arr.length;h++){
				if(h%2==0){
					Cyborg+=arr[h];
				}if(h%2!=0){
					Geno+=arr[h];
				}
			}
			if(Cyborg==Geno){
				System.out.println("Draw");
			}else{
				System.out.println("Cyborg");
			}
		}
	}
}

