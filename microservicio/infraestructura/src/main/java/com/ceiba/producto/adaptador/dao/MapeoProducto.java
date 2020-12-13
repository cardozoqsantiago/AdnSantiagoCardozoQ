package com.ceiba.producto.adaptador.dao;
//package com.ceiba.usuario.adaptador.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.time.LocalDateTime;
//
//import com.ceiba.infraestructura.jdbc.MapperResult;
//import com.ceiba.producto.modelo.dto.DtoProducto;
//
//import org.springframework.jdbc.core.RowMapper;
//
//public class MapeoProducto implements RowMapper<DtoProducto>, MapperResult {
//
//    @Override
//    public DtoProducto mapRow(ResultSet resultSet, int rowNum) throws SQLException {
//
//        Long id = resultSet.getLong("id");
//        String nombre = resultSet.getString("nombre");
//        String clave = resultSet.getString("clave");
//        LocalDateTime fecha = extraerLocalDateTime(resultSet, "fecha_creacion");
//
//        return new DtoProducto(id,nombre,clave,fecha);
//    }
//
//}
