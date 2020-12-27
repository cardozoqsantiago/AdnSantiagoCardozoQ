package com.ceiba.producto.servicio;

import com.ceiba.dominio.excepcion.ExcepcionSinDatos;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.dao.DaoProducto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.producto.servicio.testdatabuilder.ProductoTestDataBuilder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

import com.ceiba.BasePrueba;

public class ServicioEliminarProductoTest {

	/**
	 * Variable para pruebas
	 */
	private final Long cantidad = 4L;

	@Test
	public void validarNoNuloTest() {
		// arrange
		RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
		DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
		Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(null);
		ServicioEliminarProducto servicioEliminarProducto = new ServicioEliminarProducto(repositorioProducto,
				daoProducto);
		// act - assert
		BasePrueba.assertThrows(() -> servicioEliminarProducto.ejecutar(anyLong()), ExcepcionSinDatos.class,
				"El producto no existe en el sistema");
	}

	@Test
	public void validarEliminarTest() {
		// arrange
		Producto producto = new ProductoTestDataBuilder().conCantidad(5L).build();
		RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
		DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
		Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(producto);
		ServicioEliminarProducto servicioEliminarProducto = new ServicioEliminarProducto(repositorioProducto,
				daoProducto);
		servicioEliminarProducto.ejecutar(anyLong());
		// act - assert
		assertEquals(producto.getCantidad(), cantidad);
	}

	@Test
	public void validarNoNuloTodoTest() {
		// arrange
		RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
		DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
		Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(null);
		ServicioEliminarProducto servicioEliminarProducto = new ServicioEliminarProducto(repositorioProducto,
				daoProducto);
		// act - assert
		BasePrueba.assertThrows(() -> servicioEliminarProducto.ejecutarTodo(anyLong()), ExcepcionSinDatos.class,
				"El producto no existe en el sistema");
	}

	@Test
	public void eliminarProductoValidoTest() {
		// arrange
		Producto producto = new ProductoTestDataBuilder().conCantidad(1L).build();
		RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
		DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
		Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(producto);
		ServicioEliminarProducto servicioEliminarProducto = new ServicioEliminarProducto(repositorioProducto,
				daoProducto);
		servicioEliminarProducto.ejecutar(producto.getId());
		// act - assert
		verify(repositorioProducto).eliminar(producto.getId());

	}

	@Test
	public void eliminarProductoTodoValidoTest() {
		// arrange
		Producto producto = new ProductoTestDataBuilder().conCantidad(1L).build();
		RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
		DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
		Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(producto);
		ServicioEliminarProducto servicioEliminarProducto = new ServicioEliminarProducto(repositorioProducto,
				daoProducto);
		servicioEliminarProducto.ejecutarTodo(producto.getId());
		// act - assert
		verify(repositorioProducto).eliminar(producto.getId());
	}

}
