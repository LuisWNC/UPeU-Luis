package Practicas;

import java.util.Scanner;

public class Practica2 {
	
	public static void main(String[] args) {
		
		System.out.println("ingrese numero");
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int c = 1;
		int p = 2;
		int d = 2;
		while (c <= n) {
		   if (p % d == 0) {
		      if (p == d) {
		         System.out.print(p + ", ");
		         c++;
		      }
		      d = 2;
		      p++;
		   }
		   else
		      d++;
		}
		
	}

}
