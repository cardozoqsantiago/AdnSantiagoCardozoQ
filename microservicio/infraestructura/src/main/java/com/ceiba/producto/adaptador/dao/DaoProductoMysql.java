package com.ceiba.producto.adaptador.dao;
//package com.ceiba.usuario.adaptador.dao;
//
//import java.util.List;
//
//import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
//import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
//import com.ceiba.producto.modelo.dto.DtoProducto;
//import com.ceiba.producto.puerto.dao.DaoProducto;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class DaoProductoMysql implements DaoProducto {
//
//    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;
//
//    @SqlStatement(namespace="usuario", value="listar")
//    private static String sqlListar;
//
//    public DaoProductoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
//        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
//    }
//
//    @Override
//    public List<DtoProducto> listar() {
//        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoProducto());
//    }
//}
