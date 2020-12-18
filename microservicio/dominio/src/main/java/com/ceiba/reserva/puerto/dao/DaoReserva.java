package com.ceiba.reserva.puerto.dao;

import java.util.List;
import com.ceiba.reserva.modelo.dto.DtoReserva;

public interface DaoReserva {

    /**
     * Permite listar productos
     * @return los productos
     */
    List<DtoReserva> listar();
}
