package Clases;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		 boolean termino = true;
		 int dañoproporcionado;

		Jugadores campeon = new Jugadores();
		Jugadores retador = new Jugadores();
		
		campeon.setNombre("Campeon");
		campeon.setVida(5000);
		campeon.setFuerza(100);
		campeon.setNivel(5);
		
		retador.setNombre("Retador");
		retador.setVida(4500);
		retador.setFuerza(95);
		retador.setNivel(3);
		
		JOptionPane.showMessageDialog(null,"Los datos del Campeon son :\n"
				+"\n"+ "Vida: " + campeon.getVida()
				+"\n"+ "Fuerza: " + campeon.getFuerza()
				+"\n"+ "Nivel: " + campeon.getNivel());
				
		JOptionPane.showMessageDialog(null,"Los datos del Retador son :\n"
				+"\n"+ "Vida: " + retador.getVida()
				+"\n"+ "Fuerza: " + retador.getFuerza()
				+"\n"+ "Nivel: " + retador.getNivel());
		
		do {
			dañoproporcionado = campeon.ataque();
			JOptionPane.showMessageDialog(null,"El Campeon a realizado un golpe de :"+ dañoproporcionado);
			
			retador.daño(dañoproporcionado);
			
			JOptionPane.showMessageDialog(null,"La vida restante del Retador es: "+ retador.getVida());
			
			if(retador.getVida() <= 0) {
				JOptionPane.showMessageDialog(null,"El ganador del combate es el Campeon");
				break;
			}
			
			
			dañoproporcionado = retador.ataque();
			JOptionPane.showMessageDialog(null,"El Retador a realizado un golpe de :"+ dañoproporcionado);
			
			campeon.daño(dañoproporcionado);
			
			JOptionPane.showMessageDialog(null,"La vida restante del Campeon es: "+ campeon.getVida());
			
			if(campeon.getVida() <= 0) {
				JOptionPane.showMessageDialog(null,"El ganador del combate es el Retador");
				break;
			}
			
		}while(termino);
		
		
		
	}

}
