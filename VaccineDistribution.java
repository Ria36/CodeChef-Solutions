/* Vaccine Distribution */
/* https://www.codechef.com/problems/VACCINE2 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VaccineDistribution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++){
		    int N = sc.nextInt();
		    int D = sc.nextInt();
		    int a[] = new int[N];
		    double r = 0.0;
		    for(int i = 0; i < N; i++){
		        a[i] = sc.nextInt();
		        if(a[i] >= 80 || a[i] <= 9){
		            r++;
		        }
		    }
		    int daysRequired = (int) (Math.ceil(r/D) + Math.ceil((N-r)/D));
		    System.out.println(daysRequired);
		}
	}
}
