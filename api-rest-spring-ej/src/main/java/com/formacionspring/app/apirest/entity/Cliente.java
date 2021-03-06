package com.formacionspring.app.apirest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="clientes")
public class Cliente implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column (nullable = false)
	private String apellido;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	
	private int telefono;
	
	@Column(name="created_at")
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	
	private String imagen;
	
	
	@PrePersist
	public void prePersist() {
		
		if (createdAt == null) {
			createdAt = new Date();
		}
	}
	
	private static final long serialVersionUID = 1L;
	

	public long getId() {
		
		return id;
	}

	public void setId(long id) {
		
		this.id = id;
	}

	public String getNombre() {
		
		return nombre;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	public String getApellido() {
		
		return apellido;
	}

	public void setApellido(String apellido) {
		
		this.apellido = apellido;
	}

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}

	public int getTelefono() {
		
		return telefono;
	}

	public void setTelefono(int telefono) {
		
		this.telefono = telefono;
	}

	public Date getCreatedAt() {
		
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		
		this.createdAt = createdAt;
	}

	public String getImagen() {
		
		return imagen;
	}

	public void setImagen(String imagen) {
		
		this.imagen = imagen;
	}	
	
}
