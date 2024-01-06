/* https://www.codechef.com/practice/course/basic-math-java/PJABM01/problems/FAVOURITENUM?tab=statement */
/* Favourite Numbers */

import java.util.Scanner;

public class FavouriteNumbers {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
		int T=obj.nextInt();
		for (int i=0;i<T;i++){
		    int A=obj.nextInt();
		    if (A%2==0 && A%7==0){
		        System.out.println("Alice");
		    }
		    else if (A%2==1 && A%9==0){
		        System.out.println("Bob");
		    }
		    else {
		        System.out.println("Charlie");
		    }
		}
    }
}
