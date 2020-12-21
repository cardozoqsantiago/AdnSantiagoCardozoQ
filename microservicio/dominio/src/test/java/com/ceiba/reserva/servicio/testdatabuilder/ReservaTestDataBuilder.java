package com.ceiba.reserva.servicio.testdatabuilder;

import java.time.LocalDate;
import com.ceiba.reserva.modelo.entidad.Reserva;

public class ReservaTestDataBuilder {

	private Long id;
    private LocalDate fechaReserva;
    private Long idProducto;

    public ReservaTestDataBuilder() {
    	fechaReserva = LocalDate.now();
    	idProducto = 1L;
    }

    public ReservaTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public Reserva build() {
        return new Reserva(id,fechaReserva,idProducto);
    }
}
