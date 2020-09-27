package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	static ArrayList<Reptil> listadoA = new ArrayList<Reptil>();

	
	public Reptil(){
		super();
		listadoA.add(this);
	}
	public Reptil(String nombre, int edad,String habitat,String genero, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero);
		this.setColorEscamas(colorEscamas);
		this.setLargoCola(largoCola);

		
		listadoA.add(this);
	
	}
	
	
	
	
	
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public static ArrayList<Reptil> getListado() {
		return listadoA;
	}
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listadoA = listado;
	}
	
	public int cantidadReptiles() {
		return listadoA.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Animal crearIguana(String nombre, int edad,String genero) {
		Reptil a = new Reptil(nombre, edad,"humedal", genero, "verde", 3);
		iguanas++;
		return a;
	}
	public static Animal crearSerpiente(String nombre, int edad,String genero) {
		Reptil a = new Reptil(nombre, edad,"jungla", genero, "blanco", 1);
		serpientes++;
		return a;
	}
	
	
}
