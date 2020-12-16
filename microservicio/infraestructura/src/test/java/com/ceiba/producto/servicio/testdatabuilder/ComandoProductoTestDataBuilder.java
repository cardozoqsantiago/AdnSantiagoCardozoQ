package com.ceiba.producto.servicio.testdatabuilder;

import java.util.UUID;

import com.ceiba.producto.comando.ComandoProducto;

public class ComandoProductoTestDataBuilder {

	private Long id;
    private String nombre;
    private String tipoProducto;
    private Long cantidad;
    private Double precio;

    public ComandoProductoTestDataBuilder() {
        nombre = UUID.randomUUID().toString();
        tipoProducto = "1234";
        cantidad = 10L;
        precio = 50000.0;
    }

    public ComandoProductoTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ComandoProducto build() {
        return new ComandoProducto(id,nombre, tipoProducto,cantidad,precio);
    }
}
