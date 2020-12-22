package com.ceiba.reserva.modelo.dto;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class DtoReserva {

	private Long id;
	private LocalDate fechaReserva;
	private Long idProducto;
	private String nombre;
	private String tipoProducto;
	private Long cantidad;
	private Double precio;

	public DtoReserva(Long id, LocalDate fechaReserva, Long idProducto, String nombre, String tipoProducto,
			Long cantidad, Double precio) {
		this.id = id;
		this.fechaReserva = fechaReserva;
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.tipoProducto = tipoProducto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

}
