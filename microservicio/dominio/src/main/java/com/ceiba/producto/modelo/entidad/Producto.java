package com.ceiba.producto.modelo.entidad;


import lombok.Data;
import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Data
public class Producto {

   private static final String SE_DEBE_INGRESAR_LA_CANTIDAD = "Se debe ingresar la cantidad del producto";
   private static final String SE_DEBE_INGRESAR_EL_PRECIO = "se debe ingresar el precio del producto";
   private static final String SE_DEBE_INGRESAR_EL_TIPO_PRODUCTO = "Se debe ingresar el tipo del producto";
   private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_PRODUCTO = "Se debe ingresar el nombre de producto";


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

        this.id = id;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

}
