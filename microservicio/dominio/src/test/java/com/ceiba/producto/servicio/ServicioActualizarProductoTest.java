package com.ceiba.producto.servicio;

import com.ceiba.core.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.producto.servicio.testdatabuilder.ProductoTestDataBuilder;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;


public class ServicioActualizarProductoTest {

    @Test
    public void validarProductoExistenciaPreviaTest() {
        // arrange
        Producto producto = new ProductoTestDataBuilder().conId(1L).build();
        RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
        Mockito.when(repositorioProducto.existeExcluyendoId(Mockito.anyLong(), Mockito.anyString(),Mockito.anyString())).thenReturn(true);
        ServicioActualizarProducto servicioActualizarProducto = new ServicioActualizarProducto(repositorioProducto);
        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarProducto.ejecutar(producto), ExcepcionDuplicidad.class,"El producto ya existe en el sistema");
    }
    
    @Test
    public void actualizarProductoValidoTest() {
        // arrange
        Producto producto = new ProductoTestDataBuilder().conId(1L).build();
        RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
        Mockito.when(repositorioProducto.existeExcluyendoId(Mockito.anyLong(), Mockito.anyString(),Mockito.anyString())).thenReturn(false);
        ServicioActualizarProducto servicioActualizarProducto = new ServicioActualizarProducto(repositorioProducto);
        // act - assert
        servicioActualizarProducto.ejecutar(producto);
        verify(repositorioProducto).actualizar(producto);
    }
}
