package com.poolillahuaman.poo.redsocial;

public class PerfilRedSocial {
	
	private String usuario;
	private String nombreVisible;
	private String biografía;
	private String pais;
	private int seguidores;
	private int publicaciones;
	private Estado estadoPerfil;
	private boolean verificado;
	
	public String getUsuario() {
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
	public int getPublicaciones() {
		return publicaciones;
	}
	public void setPublicaciones(int publicaciones) {
		this.publicaciones = publicaciones;
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
			int publicaciones, Estado estadoPerfil, boolean verificado) {
		super();
		this.usuario = usuario;
		this.nombreVisible = nombreVisible;
		this.biografía = biografía;
		this.pais = pais;
		this.seguidores = seguidores;
		this.publicaciones = publicaciones;
		this.estadoPerfil = estadoPerfil;
		this.verificado = verificado;
	}
	// Métodos:
	
	public void MostrarInformacion() {
		System.out.println("Datos del perfil");
		System.out.println("Nombre de usuario: " + this.usuario);
		System.out.println("Nombre visible: " + this.nombreVisible);
		System.out.println("Biografía: " + this.biografía);
		System.out.println("País: " + this.pais);
		System.out.println("Número de seguidores: " + this.seguidores);
		System.out.println("Número de publicaciones: " + this.publicaciones);
		System.out.println("Estado del perfil: " +this.estadoPerfil);
		System.out.println("Cuenta verificada: " +this.verificado);
		
	}
	
	public void SumarSeguidores(int añadir) {
		
		
	}
	
	public void CambiarEstadoPerfil(Estado estado) {
		
	}
	
	
	public boolean SaberEstado() {
		if (verificado) {
			System.out.println("El perfil está activo");
		} else {
			System.out.println("El perfil no está activo");
		}
		
		return verificado;
		
	}	
	

}
