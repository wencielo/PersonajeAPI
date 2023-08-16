package com.ubp.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.ubp.demo.dto.PersonajeDTO;
import com.ubp.demo.dto.PersonajeRespuestaDTO;

@Service
public interface PersonajeServicio {
	
	public PersonajeDTO crearPersonaje(PersonajeDTO personajeDto); //Guardar Personajes
	
	public PersonajeRespuestaDTO listarPersonajes(int numeroDePagina, int tamañoPagina); //Obtener Personajes Todos
	
	public PersonajeDTO buscarPersonajePorId(Integer id); //ObtenerPersonajes por id
	
	public PersonajeDTO actualizarPersonaje(PersonajeDTO personajeDto,Integer id);
	
	public void eliminarPersonaje(Integer id); // Elimina Personajes
	
	public List<PersonajeDTO> obtenerPersonajes();

}
