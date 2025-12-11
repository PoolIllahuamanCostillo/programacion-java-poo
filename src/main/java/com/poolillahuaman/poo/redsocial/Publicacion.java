package com.poolillahuaman.poo.redsocial;

import java.time.LocalDate;

public class Publicacion {
	private String contenido;
	private int like;
	private LocalDate fecha;
	
	public void mostrarPublicacion () {
		System.out.println(contenido);
		System.out.println(like);
		System.out.println(fecha);
	}
	
	public void sumarLike() {
		like +=1;
	}
	
	public int totalLike() {
		System.out.println("La publicación tiene " + like + " likes");
		return like;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
}
