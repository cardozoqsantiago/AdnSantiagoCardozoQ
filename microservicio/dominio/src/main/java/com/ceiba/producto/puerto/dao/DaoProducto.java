package com.ceiba.producto.puerto.dao;

import java.util.List;

import com.ceiba.producto.modelo.dto.DtoProducto;
import com.ceiba.producto.modelo.entidad.Producto;

public interface DaoProducto {

    /**
     * Permite listar productos
     * @return los productos
     */
    List<DtoProducto> listar();

    /**
     * Permite buscar un producto
     * por su id
     * @param id
     * @return el registro encontrado
     */
	Producto buscarPorId(Long id);
}
