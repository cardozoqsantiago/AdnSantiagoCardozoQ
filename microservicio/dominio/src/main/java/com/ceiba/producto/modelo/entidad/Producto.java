package com.ceiba.producto.modelo.entidad;


import lombok.Data;
import static com.ceiba.dominio.ValidadorArgumento.*;
import static com.ceiba.dominio.constantes.ConstantesUtil.*;


@Data
public class Producto {
	
    private Long id;
    private String nombre;
    private String tipoProducto;
    private Long cantidad;
    private Double precio;

    public Producto(Long id,String nombre, String tipoProducto,Long cantidad, Double precio) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_PRODUCTO);
        validarObligatorio(tipoProducto, SE_DEBE_INGRESAR_EL_TIPO_PRODUCTO);
        validarObligatorio(cantidad, SE_DEBE_INGRESAR_LA_CANTIDAD);
        validarObligatorio(precio, SE_DEBE_INGRESAR_EL_PRECIO);
        validarPositivo(cantidad, SE_DEBE_INGRESAR_UN_VALOR_POSITIVO);
        validarPositivo(precio, SE_DEBE_INGRESAR_UN_VALOR_POSITIVO);

        this.id = id;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

}
