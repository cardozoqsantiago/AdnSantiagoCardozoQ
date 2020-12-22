package com.ceiba.reserva.modelo.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoReserva {

	private Long id;
	private LocalDate fechaReserva;
	private Long idProducto;
	private String nombre;
	private String tipoProducto;
	private Long cantidad;
	private Double precio;

}
