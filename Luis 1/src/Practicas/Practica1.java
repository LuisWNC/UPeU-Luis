package Practicas;

import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		
		System.out.println("ingrese numero");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println((i*2)-1);
		}
	}
}
