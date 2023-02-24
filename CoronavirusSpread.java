/* https://www.codechef.com/problems/COVID19 */
/* Coronavirus Spread */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CoronavirusSpread
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scanner.nextInt();
            }
            int mini = Integer.MAX_VALUE;
            int maxi = Integer.MIN_VALUE;
            int count = 1;
            for (int i = 0; i < n-1; i++) {
                if (Math.abs(arr[i + 1] - arr[i])<= 2)
                    count++;
                else {
                    mini = Math.min(mini, count);
                    maxi = Math.max(maxi, count);
                    count = 1;
                }
            }
            mini = Math.min(mini, count);
            maxi = Math.max(maxi, count);
            System.out.println(mini + " " + maxi);
        }
	}
}
