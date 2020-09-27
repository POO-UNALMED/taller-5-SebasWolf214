package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico(){
		
	}
	
	
	public Zoologico(String name, String ubi){
		this.setNombre(name);
		this.setUbicacion(ubi);
	}
	
	
	
	
	public void agregarZonas(Zona z1) {
		this.zonas.add(z1);
		
	}
	
	public int cantidadTotalAnimales() {
		int count=0;
		for(int i=0;i<zonas.size();i++) {
			count+=zonas.get(i).cantidadAnimales();
		}
		return count;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

	
}