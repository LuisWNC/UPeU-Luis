package Prueba;

import Encapsulamientoclass.Nacimiento;

public class Prueba {
	
	public static void main(String[] args) {
		
		Nacimiento persona = new Nacimiento();
		
		System.out.println(persona.nombre);
		System.out.println(persona.getDia());
		System.out.println(persona.getMes());
	}

}
