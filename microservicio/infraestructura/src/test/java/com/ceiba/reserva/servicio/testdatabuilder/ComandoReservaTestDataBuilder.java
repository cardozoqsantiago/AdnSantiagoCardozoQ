package com.ceiba.reserva.servicio.testdatabuilder;

import java.time.LocalDate;
import com.ceiba.reserva.comando.ComandoReserva;

public class ComandoReservaTestDataBuilder {

	private Long id;
    private LocalDate fechaReserva;
    private Long idProducto;

    public ComandoReservaTestDataBuilder() {
    	fechaReserva = LocalDate.of(2020, 12, 21);
    	idProducto = 1L;
    }

    public ComandoReservaTestDataBuilder conFecha(LocalDate fecha) {
        this.fechaReserva = fecha;
        return this;
    }

    public ComandoReserva build() {
        return new ComandoReserva(id,fechaReserva,idProducto);
    }
}
