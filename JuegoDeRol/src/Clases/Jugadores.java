package Clases;

import java.util.Random;

public class Jugadores {
	private String nombre;
	private int fuerza,vida,nivel;
	
	private Random rand = new Random();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
	//Genera el golpe
	public int ataque() {
		int aleatorio = rand.nextInt(10);
		return nivel * fuerza * aleatorio;
	}
	
	
	//Descuenta daño
	public void daño(int vida) {
		this.vida -= vida;
	}
	
	
}
