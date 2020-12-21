package com.ceiba.producto.adaptador.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.producto.modelo.entidad.Producto;

import org.springframework.jdbc.core.RowMapper;

public class MapeoProducto implements RowMapper<Producto>, MapperResult {

    @Override
    public Producto mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombre = resultSet.getString("nombre");
        String tipoProducto = resultSet.getString("tipo_producto");
        Long cantidad = resultSet.getLong("cantidad");
        Double precio = resultSet.getDouble("precio");
        //LocalDateTime fecha = extraerLocalDateTime(resultSet, "fecha_creacion");
        return new Producto(id,nombre,tipoProducto,cantidad,precio);
    }

}
