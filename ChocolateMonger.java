/* https://www.codechef.com/LP1TO205/problems/CM164364 */
/* Chocolate Monger */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChocolateMonger
{
    static int findDistinct(int arr[],int n)
    {
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            h.add(arr[i]);
        }
        return h.size();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int[] allChocolates = new int[n];
		    for(int i = 0; i < n; i++) {
		        allChocolates[i] = sc.nextInt();
		    }
		    int result = 0;
		    int distinctElements = findDistinct(allChocolates, n);
		    int possibleChocolatesForSabrina = n - x;
		    if(possibleChocolatesForSabrina >= distinctElements)
		        result = distinctElements;
		    else
		        result = possibleChocolatesForSabrina;
		    System.out.println(result);
		}
	}
}
