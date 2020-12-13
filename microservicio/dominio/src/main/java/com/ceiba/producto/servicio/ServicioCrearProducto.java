package com.ceiba.producto.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;


public class ServicioCrearProducto {

    //private static final String EL_USUARIO_YA_EXISTE_EN_EL_SISTEMA = "El usuario ya existe en el sistema";

    private final RepositorioProducto repositorioProducto;

    public ServicioCrearProducto(RepositorioProducto repositorioUsuario) {
        this.repositorioProducto = repositorioUsuario;
    }

    public Long ejecutar(Producto producto) {
        //validarExistenciaPrevia(producto);
        return this.repositorioProducto.crear(producto);
    }

//    private void validarExistenciaPrevia(Producto usuario) {
//        boolean existe = this.repositorioUsuario.existe(usuario.getNombre());
//        if(existe) {
//            throw new ExcepcionDuplicidad(EL_USUARIO_YA_EXISTE_EN_EL_SISTEMA);
//        }
//    }
}
