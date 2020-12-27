package com.ceiba.producto.servicio.testdatabuilder;

import com.ceiba.producto.modelo.entidad.Producto;

public class ProductoTestDataBuilder {

	private Long id;
    private String nombre;
    private String tipoProducto;
    private Long cantidad;
    private Double precio;

    public ProductoTestDataBuilder() {
    	nombre = "1234";
    	tipoProducto = "blusa";
    	cantidad = 1L;
    	precio = 50000.0;
    }

    public ProductoTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }
    
    public ProductoTestDataBuilder conCantidad(Long cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public Producto build() {
        return new Producto(id,nombre, tipoProducto,cantidad,precio);
    }
}
