package com.poolillahuaman.poo.basico;

public class MainTareaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TareaSimple objeto1 = new TareaSimple();
		objeto1.setTitulo("nuevo titulo"); 
		System.out.println(objeto1.getTitulo());
		
		TareaSimple objeto2 = new TareaSimple ("Otra tarea", false);
		System.out.println(objeto2.getTitulo());
		
		TareaSimple objeto3 = new TareaSimple("demo",true);
		objeto3.mostrarTarea(); 
		
		
	}

}
