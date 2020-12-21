package com.ceiba.reserva.servicio;

import com.ceiba.dominio.excepcion.ExcepcionSinDatos;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.dao.DaoProducto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.producto.servicio.testdatabuilder.ProductoTestDataBuilder;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;
import com.ceiba.reserva.servicio.testdatabuilder.ReservaTestDataBuilder;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

import com.ceiba.BasePrueba;

public class ServicioCrearReservaTest {
	
	/**
	 * variable para pruebas
	 */
	private final Long CANTIDAD = 0L;
	/**
	 * Variable para pruebas
	 */
	private final LocalDate FECHA = LocalDate.of(2020, 12, 20);

    @Test
    public void validarReservaNoNulaTest() {
        // arrange
        Reserva reserva = new ReservaTestDataBuilder().build();
        RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
        RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
        Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(null);
        ServicioCrearReserva servicioCrearReserva= new ServicioCrearReserva(repositorioReserva, daoProducto, repositorioProducto);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearReserva.ejecutar(reserva), ExcepcionSinDatos.class,"El producto no existe en el sistema");
    }
    
    @Test
    public void validarReservaCantidadProducto() {
        // arrange
        Reserva reserva = new ReservaTestDataBuilder().build();
        Producto producto = new ProductoTestDataBuilder().build();
        producto.setCantidad(CANTIDAD);
        RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
        RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
        Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(producto);
        ServicioCrearReserva servicioCrearReserva= new ServicioCrearReserva(repositorioReserva, daoProducto, repositorioProducto);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearReserva.ejecutar(reserva), ExcepcionSinDatos.class,"No hay existencias disponibles del producto");
    }
    
    @Test
    public void validarEsSabadoDomingo() {
        Reserva reserva = new ReservaTestDataBuilder().build();
        reserva.setFechaReserva(FECHA);
        Producto producto = new ProductoTestDataBuilder().build();
        RepositorioProducto repositorioProducto = Mockito.mock(RepositorioProducto.class);
        RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoProducto daoProducto = Mockito.mock(DaoProducto.class);
        Mockito.when(daoProducto.buscarPorId(Mockito.anyLong())).thenReturn(producto);
        ServicioCrearReserva servicioCrearReserva= new ServicioCrearReserva(repositorioReserva, daoProducto, repositorioProducto);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearReserva.ejecutar(reserva), ExcepcionValorInvalido.class,"No se pueden hacer reservas sabados ni domingos");
    }
}
