package com.ceiba.reserva.adaptador.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.reserva.modelo.dto.DtoReserva;

import org.springframework.jdbc.core.RowMapper;

public class MapeoReserva implements RowMapper<DtoReserva>, MapperResult {

    @Override
    public DtoReserva mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        LocalDate fechaReserva = extraerLocalDate(resultSet, "fecha");
        Long idProducto = resultSet.getLong("producto_id");
        String nombre = resultSet.getString("nombre");
        String tipoProducto = resultSet.getString("tipo_producto");
        Long cantidad = resultSet.getLong("cantidad");
        Double precio = resultSet.getDouble("precio");
        //LocalDateTime fecha = extraerLocalDateTime(resultSet, "fecha_creacion");
        return new DtoReserva(id,fechaReserva,idProducto,nombre,tipoProducto,cantidad,precio);
    }

}
