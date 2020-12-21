package com.ceiba.configuracion;

import com.ceiba.dominio.ValidadorFechas;
import com.ceiba.producto.puerto.dao.DaoProducto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.producto.servicio.ServicioActualizarProducto;
import com.ceiba.producto.servicio.ServicioCrearProducto;
import com.ceiba.producto.servicio.ServicioEliminarProducto;
import com.ceiba.reserva.puerto.dao.DaoReserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;
import com.ceiba.reserva.servicio.ServicioCrearReserva;
import com.ceiba.reserva.servicio.ServicioEliminarReserva;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

	@Bean
	public ServicioCrearProducto servicioCrearProducto(RepositorioProducto repositorioProducto) {
		return new ServicioCrearProducto(repositorioProducto);
	}

	@Bean
	public ServicioEliminarProducto servicioEliminarProducto(RepositorioProducto repositorioProducto,
			DaoProducto daoProducto) {
		return new ServicioEliminarProducto(repositorioProducto, daoProducto);
	}

	@Bean
	public ServicioActualizarProducto servicioActualizarProducto(RepositorioProducto repositorioProducto) {
		return new ServicioActualizarProducto(repositorioProducto);
	}

	@Bean
	public ServicioCrearReserva servicioCrearReserva(RepositorioReserva repositorioReserva, DaoProducto daoProducto,
			RepositorioProducto repositorioProducto, ValidadorFechas validadorFechas) {
		return new ServicioCrearReserva(repositorioReserva, daoProducto, repositorioProducto, validadorFechas);
	}

	@Bean
	public ServicioEliminarReserva servicioEliminarReserva(RepositorioReserva repositorioReserva, DaoReserva daoReserva,
			RepositorioProducto repositorioProducto, DaoProducto daoProducto) {
		return new ServicioEliminarReserva(repositorioReserva, daoReserva, repositorioProducto, daoProducto);
	}

}
