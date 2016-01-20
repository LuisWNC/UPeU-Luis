package Encapsulamientoclass;

public class Main {
	
	public static void main(String[] args) {
		
		//nombre_clase nombre_objeto 
		Nacimiento persona = new Nacimiento();
		System.out.println(persona.getDia());
		
		persona.setDia(7);
		persona.setDia(67);
		System.out.println(persona.getDia());
		System.out.println(persona.getMes());
		persona.setMes(6);
		System.out.println(persona.getMes());
		System.out.println(persona.apellido);
	}
}
