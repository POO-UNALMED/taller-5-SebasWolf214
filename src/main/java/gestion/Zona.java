package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	static ArrayList<Animal> animal = new ArrayList<Animal>();

	
	
	public Zona(){
		
	}
	public Zona(String name, Zoologico zoo){
		this.setNombre(name);
		this.setZoo(zoo);
	}
	
	
	public void agregarAnimales(Animal a1) {
		animal.add(a1);
		a1.setZona(this);
	}
	public int cantidadAnimales() {
		return animal.size();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	
	
}
