package com.formacionspring.app.apirest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionspring.app.apirest.entity.Usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
	
	/*
	@Query("select u from Usuario u where u.username = ?1")
	public Usuario findByUsername2(String username);
	*/
}