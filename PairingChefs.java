/* https://www.codechef.com/problems/PAIRING */
/* Pairing Chefs */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PairingChefs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,i,j,k,m,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0){
		  n = sc.nextInt();
		  m = sc.nextInt();
		  int [][]pa = new int[m][2];
		  HashSet<Integer> ds = new HashSet<Integer>();
		  ArrayList<Integer> al = new ArrayList<Integer>();
		  for(i = 0; i<m; i++){
		      pa[i][0] = sc.nextInt();
		      pa[i][1] = sc.nextInt();
		  }
		  for(i = m-1; i>=0; i--){
		      if(!ds.contains(pa[i][0]) && !ds.contains(pa[i][1])){
		          al.add(0,i);
		          ds.add(pa[i][0]);
		          ds.add(pa[i][1]);
		      }
		  }
		  for(int l: al)
		    System.out.print(l+ " ");
		  System.out.println();
		}
	}
}
