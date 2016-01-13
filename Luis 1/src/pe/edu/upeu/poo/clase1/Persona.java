package pe.edu.upeu.poo.clase1;

import java.util.Date;

public class Persona {
	
	String nombre;
	String apePaterno;
	String apeMaterno;
	double altura;
	String dni;
	String celular;
	Date fechaNacimiento;
	String email;
	String tipoSangre;
	String direccion;
	String religion;
	String sexo;
	String estadoCivil;
	boolean vive;
	
	
	public int getEdad(){
		return 0;
	
		
		
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno + ", altura="
				+ altura + ", dni=" + dni + ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento + ", email="
				+ email + ", tipoSangre=" + tipoSangre + ", direccion=" + direccion + ", religion=" + religion
				+ ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", vive=" + vive + "]";
	}
	
	
	

}
