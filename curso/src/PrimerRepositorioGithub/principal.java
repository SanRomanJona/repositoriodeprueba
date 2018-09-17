package PrimerRepositorioGithub;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		String nombre;
		nombre = JOptionPane.showInputDialog("¿Cual es su nombre?");

		JOptionPane.showMessageDialog(null,"Buenos dias señor "+nombre);
	}

}
