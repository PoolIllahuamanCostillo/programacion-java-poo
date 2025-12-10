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
	
	public void sumaLike() {
		System.out.println();
	}
	
	public int totalLike() {
		System.out.println("La publicación tiene " + like + " likes");
		return like;
	}
}
