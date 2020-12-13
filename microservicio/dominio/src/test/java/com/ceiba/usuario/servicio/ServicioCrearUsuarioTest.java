//package com.ceiba.usuario.servicio;
//
//import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
//import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
//import com.ceiba.producto.modelo.entidad.Producto;
//import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
//import com.ceiba.producto.servicio.ServicioCrearProducto;
//import com.ceiba.usuario.servicio.testdatabuilder.UsuarioTestDataBuilder;
//import org.junit.Test;
//import org.mockito.Mockito;
//
//import com.ceiba.BasePrueba;
//
//public class ServicioCrearUsuarioTest {
//
//    @Test
//    public void validarClaveLongitudMenor4Test() {
//        // arrange
//        UsuarioTestDataBuilder usuarioTestDataBuilder = new UsuarioTestDataBuilder().conClave("124");
//        // act - assert
//        BasePrueba.assertThrows(() -> usuarioTestDataBuilder.build(), ExcepcionLongitudValor.class, "La clave debe tener una longitud mayor o igual a 4");
//    }
//
//    @Test
//    public void validarUsuarioExistenciaPreviaTest() {
//        // arrange
//        Producto usuario = new UsuarioTestDataBuilder().build();
//        RepositorioProducto repositorioUsuario = Mockito.mock(RepositorioProducto.class);
//        Mockito.when(repositorioUsuario.existe(Mockito.anyString())).thenReturn(true);
//        ServicioCrearProducto servicioCrearUsuario = new ServicioCrearProducto(repositorioUsuario);
//        // act - assert
//        BasePrueba.assertThrows(() -> servicioCrearUsuario.ejecutar(usuario), ExcepcionDuplicidad.class,"El usuario ya existe en el sistema");
//    }
//}
