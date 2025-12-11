package com.poolillahuaman.poo.basico;

public class TareaSimple {

	// Atributos:

	int duracionEnHoras;
	private String titulo;
	boolean completado;

	public TareaSimple(String titulo, boolean completado) {
		this.titulo = titulo;
		this.completado = completado;
	}

	// Métodos:

	public TareaSimple() {
		// TODO Auto-generated constructor stub
	}

	public void cambiarEstado() {
		this.completado = !completado;
		/**
		 * if (this.completada) { this.completada =false; }else { this.completada =true;
		 * }
		 **/
	}

	public void mostrarTarea() {
		if (this.completado) {
			System.out.println("La tarea " + this.titulo + " está completada");
		} else {
			System.out.println("La tarea " + this.titulo + " no está completada");
		}
	}

	public int getDuracionEnHoras() {
		return duracionEnHoras;
	}

	public void setDuracionEnHoras(int duracionEnHoras) {
		this.duracionEnHoras = duracionEnHoras;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isCompletado() {
		return completado;
	}

	public void setCompletado(boolean completado) {
		this.completado = completado;
	}

}
