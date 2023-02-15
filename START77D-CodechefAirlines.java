/* Codechef Airlines */
/* https://www.codechef.com/START77D/problems/AIRLINES */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodechefAirlines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int xCapacity = sc.nextInt();
		    int yPeople = sc.nextInt();
		    int zAirplanes = sc.nextInt();
		    int seats = ((10*xCapacity)*zAirplanes);
		    int totalMoney = yPeople * zAirplanes;
		    if((xCapacity * 10)>=yPeople){
		        System.out.println(totalMoney);
		    }
		    else{
		        System.out.println(seats);
		    }
		}
	}
}
