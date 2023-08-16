package com.ubp.demo.exceptiones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private String nombreRecurso;
	private String nombreCampo;
	private Integer valor;	
	
	public ResourceNotFoundException(String nombreRecurso, String nombreCampo, Integer valor) {
		super(String.format("%s no encontrado con: %s, '%s", nombreRecurso,nombreCampo,valor));
		this.nombreRecurso = nombreRecurso;
		this.nombreCampo = nombreCampo;
		this.valor = valor;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getNombreRecurso() {
		return nombreRecurso;
	}
	public void setNombreRecurso(String nombreRecurso) {
		this.nombreRecurso = nombreRecurso;
	}
	public String getNombreCampo() {
		return nombreCampo;
	}
	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	

}
