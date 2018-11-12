package clases;

public class Principal {

	public static void main(String[] args) {
		Arquero jugador1 = new Arquero();

		jugador1.nombre = "Robin hood";

		jugador1.equipo = "Azul";

		jugador1.salud = 100;

		System.out.println("El nombre del arquero es :"+ jugador1.nombre);
		System.out.println("Es del equipo :"+ jugador1.equipo);

		jugador1.ataqueArquero();
		jugador1.defensaArquero();

		Jinete jugador2 = new Jinete();

		jugador2.salud = 200;
		jugador2.equipo = "Rojo";
		jugador2.nombre = "Caballero Blanco";

		System.out.println("El nombre del Jinete es :"+ jugador2.nombre);
		System.out.println("Es del equipo :"+ jugador2.equipo);
		
		jugador2.caminar();


		jugador2.ataqueJinete();
		jugador2.defensaJinete();
		
		ArqueroNovato jugador3 = new ArqueroNovato();
		
		
		jugador3.salud = 50;
		jugador3.equipo = "Amarillo";
		jugador3.nombre = "Mini Arque";
		jugador3.Entrenamiento();

	}

}
