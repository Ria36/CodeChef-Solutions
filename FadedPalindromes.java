/* https://www.codechef.com/problems/LEXOPAL */
/* Faded Palindromes */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FadedPalindromes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		    String s1 = sc.next();
		    char ch[] = s1.toCharArray();
		    int l=0,r=s1.length()-1,f=0;
		    while(l<=r){
		        if(ch[l]!='.' && ch[r]!='.' && ch[l]!=ch[r]){
		        f=1;
		        break;
		        }
		        else if(ch[l]== '.' && ch[r] == '.'){
		            ch[l] ='a';
		            ch[r] = 'a';
		        }
		        else if(ch[l]=='.'){
		            ch[l] = ch[r];
		        }
		        else if(ch[r] == '.'){
		            ch[r] = ch[l];
		        }
		        l++;
		        r--;
		    }
		    if(f==1)
		    System.out.println(-1);
		    else 
		    System.out.println(ch);
		}
	}
}
