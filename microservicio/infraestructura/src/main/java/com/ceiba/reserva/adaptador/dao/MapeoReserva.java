package com.ceiba.reserva.adaptador.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.reserva.modelo.entidad.Reserva;

import org.springframework.jdbc.core.RowMapper;

public class MapeoReserva implements RowMapper<Reserva>, MapperResult {

    @Override
    public Reserva mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        LocalDate fechaReserva = extraerLocalDate(resultSet, "fecha");
        Long idProducto = resultSet.getLong("producto_id");
        return new Reserva(id,fechaReserva,idProducto);
    }

}
