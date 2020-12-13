package com.ceiba.producto.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;

public class ServicioActualizarProducto {

   // private static final String EL_USUARIO_YA_EXISTE_EN_EL_SISTEMA = "El usuario ya existe en el sistema";

    private final RepositorioProducto repositorioProducto;

    public ServicioActualizarProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public void ejecutar(Producto usuario) {
        //validarExistenciaPrevia(usuario);
        this.repositorioProducto.actualizar(usuario);
    }

//    private void validarExistenciaPrevia(Producto usuario) {
//        boolean existe = this.repositorioUsuario.existeExcluyendoId(usuario.getId(),usuario.getNombre());
//        if(existe) {
//            throw new ExcepcionDuplicidad(EL_USUARIO_YA_EXISTE_EN_EL_SISTEMA);
//        }
//    }
}
