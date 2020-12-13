//package com.ceiba.usuario.servicio;
//
//import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
//import com.ceiba.producto.modelo.entidad.Producto;
//import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
//import com.ceiba.producto.servicio.ServicioActualizarProducto;
//import com.ceiba.usuario.servicio.testdatabuilder.UsuarioTestDataBuilder;
//import org.junit.Test;
//import org.mockito.Mockito;
//
//import com.ceiba.BasePrueba;
//
//public class ServicioActualizarUsuarioTest {
//
//    @Test
//    public void validarUsuarioExistenciaPreviaTest() {
//        // arrange
//        Producto usuario = new UsuarioTestDataBuilder().conId(1L).build();
//        RepositorioProducto repositorioUsuario = Mockito.mock(RepositorioProducto.class);
//        Mockito.when(repositorioUsuario.existeExcluyendoId(Mockito.anyLong(),Mockito.anyString())).thenReturn(true);
//        ServicioActualizarProducto servicioActualizarUsuario = new ServicioActualizarProducto(repositorioUsuario);
//        // act - assert
//        BasePrueba.assertThrows(() -> servicioActualizarUsuario.ejecutar(usuario), ExcepcionDuplicidad.class,"El usuario ya existe en el sistema");
//    }
//}
