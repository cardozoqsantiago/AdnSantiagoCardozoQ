package com.ceiba.reserva.servicio;

import com.ceiba.dominio.excepcion.ExcepcionSinDatos;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.dao.DaoProducto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.producto.servicio.testdatabuilder.ProductoTestDataBuilder;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;
import com.ceiba.reserva.servicio.testdatabuilder.ReservaTestDataBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyLong;

import org.junit.Test;
import org.mockito.Mockito;

import com.ceiba.BasePrueba;

public class ServicioEliminarReservaTest {
	
	/**
	 * Variable para pruebas
	 */
	private final Long cantidad = 6L;
	
    @Test
    public void validarReservaNoNulaTest() {
        // arrange
        RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
        RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
        DaoReserva daoReserva = Mockito.mock(DaoReserva.class);
        Mockito.when(daoReserva.buscarPorId(Mockito.anyLong())).thenReturn(null);
        ServicioEliminarReserva servicioEliminarReserva= new ServicioEliminarReserva(repositorioReserva, daoReserva, repositorioProducto, daoProducto);
        // act - assert
        BasePrueba.assertThrows(() -> servicioEliminarReserva.ejecutar(anyLong()), ExcepcionSinDatos.class,"La reserva no existe en el sistema");
    }
    
    @Test
	public void validarProductoNoNuloTest() {
		// arrange
    	Reserva reserva = new ReservaTestDataBuilder().build();
		RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
		DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
		RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoReserva daoReserva = Mockito.mock(DaoReserva.class);
        Mockito.when(daoReserva.buscarPorId(Mockito.anyLong())).thenReturn(reserva);
		Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(null);
		ServicioEliminarReserva servicioEliminarReserva= new ServicioEliminarReserva(repositorioReserva, daoReserva, repositorioProducto, daoProducto);
		// act - assert
		BasePrueba.assertThrows(() -> servicioEliminarReserva.ejecutar(anyLong()), ExcepcionSinDatos.class,
				"El producto no existe en el sistema");
	}
    
    @Test
    public void validarCantidadTest() {
    	Reserva reserva = new ReservaTestDataBuilder().build();
    	Producto producto = new ProductoTestDataBuilder().build();
    	producto.setCantidad(5L);
		RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
		DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
		RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoReserva daoReserva = Mockito.mock(DaoReserva.class);
        Mockito.when(daoReserva.buscarPorId(Mockito.anyLong())).thenReturn(reserva);
		Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(producto);
		ServicioEliminarReserva servicioEliminarReserva= new ServicioEliminarReserva(repositorioReserva, daoReserva, repositorioProducto, daoProducto);
		servicioEliminarReserva.ejecutar(anyLong());
		// act - assert
		assertEquals(producto.getCantidad(),cantidad);
    }
     
}
