package com.ceiba.reserva.comando;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoReserva{

	private Long id;
    private LocalDate fechaReserva;
    private Long idProducto;
}
