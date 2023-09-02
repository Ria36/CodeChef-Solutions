/* https://www.codechef.com/problems/SPELLBOB */
/* Spell Bob */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SpellBob
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t-->0){
			String s=ob.next(),a=ob.next();
			char ch[]=s.toCharArray();
			char dh[]=a.toCharArray();
			if((ch[0]=='b'||dh[0]=='b')&&(ch[1]=='b'||dh[1]=='b')&&(ch[2]=='o'||dh[2]=='o')){
				System.out.println("yes");
			}
			else if((ch[0]=='b'||dh[0]=='b')&&(ch[1]=='o'||dh[1]=='o')&&(ch[2]=='b'||dh[2]=='b')){
				System.out.println("yes");
			}
			else if((ch[0]=='o'||dh[0]=='o')&&(ch[1]=='b'||dh[1]=='b')&&(ch[2]=='b'||dh[2]=='b')){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}
}
