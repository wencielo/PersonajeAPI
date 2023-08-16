package com.ubp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ubp.demo.models.Personaje;

//Este es mi DAO que se conecta con la base de datos
public interface PersonajeRepositorio extends JpaRepository<Personaje,Integer>{

}
