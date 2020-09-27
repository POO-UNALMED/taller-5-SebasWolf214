package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	ArrayList<Ave> listadoA = new ArrayList<Ave>();

	public Ave(){
		super();
	}
	public Ave(String nombre, int edad,String habitat,String genero, String colorPlumas){
		super(nombre, edad, habitat, genero);
		this.setColorPlumas(colorPlumas);

		
		listadoA.add(this);
	
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	
	public int cantidadAves() {
		return listadoA.size();
	}
	public String movimiento() {
		return "volar";
	}
	public static Animal crearHalcon(String nombre, int edad,String genero) {
		Ave a = new Ave(nombre, edad, "montanas",genero, "cafe glorioso");
		halcones++;
		return a;
	}
	public static Animal crearAguila(String nombre, int edad,String genero) {
		Ave a = new Ave(nombre, edad, "montanas",genero, "blanco y amarillo");
		aguilas++;
		return a;
	}
	


	
	
	
	
}
