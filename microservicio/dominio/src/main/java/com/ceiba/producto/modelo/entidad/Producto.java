package com.ceiba.producto.modelo.entidad;


import lombok.Getter;

import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.validarLongitud;
import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Producto {

////    private static final String SE_DEBE_INGRESAR_LA_FECHA_CREACION = "Se debe ingresar la fecha de creación";
////    private static final String LA_CLAVE_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A = "La clave debe tener una longitud mayor o igual a %s";
////    private static final String SE_DEBE_INGRESAR_LA_CLAVE = "Se debe ingresar la clave";
////    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_PRODUCTO = "Se debe ingresar el nombre de producto";
//
//    private static final int LONGITUD_MINIMA_CLAVE = 4;

    private Long id;
    private String nombre;
    private String tipoProducto;
    private Long cantidad;
    private Double precio;

    public Producto(Long id,String nombre, String tipoProducto,Long cantidad, Double precio) {
//        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_PRODUCTO);
//        validarObligatorio(clave, SE_DEBE_INGRESAR_LA_CLAVE);
//        validarLongitud(clave, LONGITUD_MINIMA_CLAVE, String.format(LA_CLAVE_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A,LONGITUD_MINIMA_CLAVE));
//        validarObligatorio(fechaCreacion, SE_DEBE_INGRESAR_LA_FECHA_CREACION);

        this.id = id;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

}
