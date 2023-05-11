/* https://www.codechef.com/problems/CHEFAPAR */
/* Chef and His Apartment Dues */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndHisApartmentDues
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N = sc.nextInt();
		    int[] A = new int[N];
		    
		    boolean zeroNotFound = true;
		    long firstDueMonth = 0;
		    int feeDuesForMonths = 0;
		    
		    for(int i=0; i<N; i++){
		        A[i] = sc.nextInt();
		        
		        if(A[i] == 0){
		            if(zeroNotFound){
		                zeroNotFound = false;
		                firstDueMonth = i+1;
		            }
		            feeDuesForMonths++;
		        }
		    }
		    long fines = (firstDueMonth == 0) ? 0 : (N + 1 - firstDueMonth) * 100;
		    
		    System.out.println((feeDuesForMonths * 1000) + fines);
		    T--;
		}
	}
}
