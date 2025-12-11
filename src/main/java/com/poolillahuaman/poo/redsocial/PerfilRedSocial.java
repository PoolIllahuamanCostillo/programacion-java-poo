package com.poolillahuaman.poo.redsocial;

import java.util.ArrayList;

// A) Creación de clases
public class PerfilRedSocial {
	
	// Atributos: 
	private String usuario;
	private String nombreVisible;
	private String biografía;
	private String pais;
	private int seguidores;
	
	private Estado estadoPerfil;
	private boolean verificado;
	private ArrayList<Publicacion> publicaciones;
	
	// Constructores getting and setting: 
	
	public ArrayList<Publicacion> getPublicacion() {
		return publicaciones;
	}
	public void setPublicacion(ArrayList<Publicacion> publicacion) {
		this.publicaciones = publicacion;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getString() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombreVisible() {
		return nombreVisible;
	}
	public void setNombreVisible(String nombreVisible) {
		this.nombreVisible = nombreVisible;
	}
	public String getBiografía() {
		return biografía;
	}
	public void setBiografía(String biografía) {
		this.biografía = biografía;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getSeguidores() {
		return seguidores;
	}
	public void setSeguidores(int seguidores) {
		this.seguidores = seguidores;
	}
	public int getNumeroPublicaciones() {
		return this.publicaciones.size();
	}

	public Estado getEstadoPerfil() {
		return estadoPerfil;
	}
	public void setEstadoPerfil(Estado estadoPerfil) {
		this.estadoPerfil = estadoPerfil;
	}
	public boolean isVerificado() {
		return verificado;
	}
	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}

	
	public PerfilRedSocial(String usuario, String nombreVisible, String biografía, String pais, int seguidores,
			 Estado estadoPerfil, boolean verificado) {
		super();
		this.usuario = usuario;
		this.nombreVisible = nombreVisible;
		this.biografía = biografía;
		this.pais = pais;
		this.seguidores = seguidores;
		this.estadoPerfil = estadoPerfil;
		this.verificado = verificado;
		this.publicaciones = new ArrayList<Publicacion>();
	}
	
	
	
	// Métodos:
	
	public void MostrarInformacion() {
		System.out.println("Datos del perfil: ");
		System.out.println("Nombre de usuario: " + usuario);
		System.out.println("Nombre visible: " + nombreVisible);
		System.out.println("Biografía: " + biografía);
		System.out.println("País: " + pais);
		System.out.println("Número de seguidores: " + seguidores);
		System.out.println("Número de publicaciones: " + this.getNumeroPublicaciones());
		System.out.println("Estado del perfil: " + estadoPerfil);
		System.out.println("Cuenta verificada: " + verificado);
		
	}
	
	public void AgregarSeguidores(int cantidad) {
		if (cantidad <=0) {
			System.out.println("La cantidad a añadir debe ser mayor que cero");
			return;
		}
		
		seguidores += cantidad;
		System.out.println("Seguidores en total: " + seguidores);
		
	}
	
	public void CambiarEstadoPerfil(Estado estado) {
		
		if(estado == Estado.ACTIVADO ){
			this.estadoPerfil = Estado.ACTIVADO;
			System.out.println("El perfil está activo.");
		} else if (estado == Estado.DESACTIVADO) {
			this.estadoPerfil = Estado.DESACTIVADO;
			System.out.println("El perfil está desactivado");
		} else {
			this.estadoPerfil = Estado.BLOQUEADO;
			System.out.println("El perfil está bloqueado");
		}
	}
	
	
	
	public boolean PerfilActivo() {
		if (verificado) {
			System.out.println("El perfil está activo");
		} else {
			System.out.println("El perfil no está activo");
		}
		
		return verificado;	
	}
		


// B) Uso de un nuevo tipo ArrayList:

	public void CrearPublicacion(String contenido){
		Publicacion p = new Publicacion();
		p.setContenido(contenido);
		this.publicaciones.add(p);
		
	}
	
	public void MostrarPublicaciones(){
		for (Publicacion publicacion : publicaciones) {
			publicacion.getContenido();
		}
	}
		
}
	