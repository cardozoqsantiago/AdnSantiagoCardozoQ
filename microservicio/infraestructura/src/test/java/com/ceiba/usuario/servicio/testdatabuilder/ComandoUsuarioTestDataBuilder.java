//package com.ceiba.usuario.servicio.testdatabuilder;
//
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//import com.ceiba.producto.comando.ComandoProducto;
//
//public class ComandoUsuarioTestDataBuilder {
//
//    private Long id;
//    private String nombre;
//    private String clave;
//    private LocalDateTime fecha;
//
//    public ComandoUsuarioTestDataBuilder() {
//        nombre = UUID.randomUUID().toString();
//        clave = "1234";
//        fecha = LocalDateTime.now();
//    }
//
//    public ComandoUsuarioTestDataBuilder conNombre(String nombre) {
//        this.nombre = nombre;
//        return this;
//    }
//
//    public ComandoProducto build() {
//        return new ComandoProducto(id,nombre, clave,fecha);
//    }
//}
