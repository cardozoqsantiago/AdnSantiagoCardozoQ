package com.ceiba.reserva.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reserva {

	private Long id;
	private LocalDate fechaReserva;
	private Long idProducto;

	public Reserva(Long id, LocalDate fechaReserva, Long idProducto) {
		this.id = id;
		this.fechaReserva = fechaReserva;
		this.idProducto = idProducto;

	}

}
