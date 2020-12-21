package com.ceiba.reserva.puerto.dao;

import java.util.List;
import com.ceiba.reserva.modelo.dto.DtoReserva;
import com.ceiba.reserva.modelo.entidad.Reserva;

public interface DaoReserva {

    /**
     * Permite listar productos
     * @return los productos
     */
    List<DtoReserva> listar();

    /**
     * Permite buscar una reserva por 
     * su id
     * @param id
     * @return el registro encontrado
     */
	Reserva buscarPorId(Long id);
}
