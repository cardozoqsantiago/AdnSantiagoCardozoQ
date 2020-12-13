//package com.ceiba.usuario.servicio.testdatabuilder;
//
//import java.time.LocalDateTime;
//
//import com.ceiba.producto.modelo.entidad.Producto;
//
//public class UsuarioTestDataBuilder {
//
//    private Long id;
//    private String nombreUsuario;
//    private String clave;
//    private LocalDateTime fecha;
//
//    public UsuarioTestDataBuilder() {
//        nombreUsuario = "1234";
//        clave = "1234";
//        fecha = LocalDateTime.now();
//    }
//
//    public UsuarioTestDataBuilder conClave(String clave) {
//        this.clave = clave;
//        return this;
//    }
//
//    public UsuarioTestDataBuilder conId(Long id) {
//        this.id = id;
//        return this;
//    }
//
//    public Producto build() {
//        return new Producto(id,nombreUsuario, clave,fecha);
//    }
//}
