package Contructor;

import javax.swing.JOptionPane;

public class Contructor {

	public String nombre, estudio, sexo;
	public int edad;
	
	public String instituto, turno;
	public int horas;



	public Contructor() {
		JOptionPane.showMessageDialog(null,"Buenos dias, este es el contructor vacio!");
	}

	public Contructor(String nombre, int edad, String sexo, String estudio) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estudio = estudio;
		JOptionPane.showMessageDialog(null,"Mi nombre es "+nombre+", tengo "+edad+" años, soy "+sexo+" y esto estudiando "+estudio);
	}
	public Contructor(String instituto,String turno, int horas) {
		this.instituto = instituto;
		this.turno = turno;
		this.horas = horas;
		JOptionPane.showMessageDialog(null,"Estudio en el instituto "+instituto+", en el turno de la "+turno+", con una cantidad de "+horas+"hs. diarias.");
	}

}
