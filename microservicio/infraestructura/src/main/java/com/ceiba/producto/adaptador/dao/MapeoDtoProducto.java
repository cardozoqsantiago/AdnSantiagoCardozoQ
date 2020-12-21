package com.ceiba.producto.adaptador.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.producto.modelo.dto.DtoProducto;

import org.springframework.jdbc.core.RowMapper;

public class MapeoDtoProducto implements RowMapper<DtoProducto>, MapperResult {

    @Override
    public DtoProducto mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombre = resultSet.getString("nombre");
        String tipoProducto = resultSet.getString("tipo_producto");
        Long cantidad = resultSet.getLong("cantidad");
        Double precio = resultSet.getDouble("precio");
        //LocalDateTime fecha = extraerLocalDateTime(resultSet, "fecha_creacion");
        return new DtoProducto(id,nombre,tipoProducto,cantidad,precio);
    }

}
