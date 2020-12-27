package com.ceiba.producto.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.producto.servicio.testdatabuilder.ProductoTestDataBuilder;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

import com.ceiba.BasePrueba;

public class ServicioCrearProductoTest {

    @Test
    public void validarProductoExistenciaPreviaTest() {
        // arrange
        Producto producto = new ProductoTestDataBuilder().build();
        RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
        Mockito.when(repositorioProducto.existe(Mockito.anyString(),Mockito.anyString())).thenReturn(true);
        ServicioCrearProducto servicioCrearProducto = new ServicioCrearProducto(repositorioProducto);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearProducto.ejecutar(producto), ExcepcionDuplicidad.class,"El producto ya existe en el sistema");
    }
    
    @Test
    public void crearProductoValidoTest() {
        // arrange
        Producto producto = new ProductoTestDataBuilder().build();
        RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
        Mockito.when(repositorioProducto.existe(Mockito.anyString(),Mockito.anyString())).thenReturn(false);
        ServicioCrearProducto servicioCrearProducto = new ServicioCrearProducto(repositorioProducto);
        servicioCrearProducto.ejecutar(producto);
        verify(repositorioProducto).crear(producto);
    }
}
