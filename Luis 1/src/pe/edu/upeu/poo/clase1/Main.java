package pe.edu.upeu.poo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {

		Persona luis = new Persona();
		luis.nombre = "Luis Wilson";
		luis.altura = 1.62;
		luis.apePaterno = "Ninacondo";
		luis.apeMaterno = "Condori";
		luis.celular = "No Tengo";
		luis.direccion = "jr. 1ro de marzo con el jr. huancane";
		luis.dni = "46785529";
		luis.email = "matrix_nc16@hotmail.com";
		luis.estadoCivil = "Soltero";
		luis.religion = "No Tengo";
		luis.sexo = "Maculino";
		luis.tipoSangre = "O+";
		luis.vive = true;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			luis.fechaNacimiento = sdf.parse("16/09/1985");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(luis);

	}

}
