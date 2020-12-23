package com.ceiba.reserva.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;
import static com.ceiba.dominio.constantes.ConstantesUtil.*;

import java.time.LocalDate;

@Getter
@Setter
public class Reserva {

	private Long id;
	private LocalDate fechaReserva;
	private Long idProducto;

	public Reserva(Long id, LocalDate fechaReserva, Long idProducto) {
		validarObligatorio(fechaReserva, SE_DEBE_INGRESAR_LA_FECHA_DE_RESERVA);
		this.id = id;
		this.fechaReserva = fechaReserva;
		this.idProducto = idProducto;

	}

}
