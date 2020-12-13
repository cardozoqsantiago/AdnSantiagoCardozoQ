package com.ceiba.producto.puerto.dao;

import java.util.List;

import com.ceiba.producto.modelo.dto.DtoProducto;

public interface DaoProducto {

    /**
     * Permite listar productos
     * @return los productos
     */
    List<DtoProducto> listar();
}
