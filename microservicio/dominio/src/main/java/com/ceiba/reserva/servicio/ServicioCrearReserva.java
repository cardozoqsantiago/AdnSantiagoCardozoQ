package com.ceiba.reserva.servicio;

import static com.ceiba.dominio.ValidadorFechas.*;
import static com.ceiba.dominio.constantes.ConstantesUtil.*;
import com.ceiba.dominio.excepcion.ExcepcionSinDatos;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.dao.DaoProducto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;

public class ServicioCrearReserva {

	private final RepositorioReserva repositorioReserva;

	private final DaoProducto daoProducto;

	private final RepositorioProducto repositorioProducto;

	public ServicioCrearReserva(RepositorioReserva repositorioReserva, DaoProducto daoProducto,
			RepositorioProducto repositorioProducto) {
		this.repositorioReserva = repositorioReserva;
		this.daoProducto = daoProducto;
		this.repositorioProducto = repositorioProducto;
	}

	public Long ejecutar(Reserva reserva) {
		Producto producto = this.daoProducto.buscarPorId(reserva.getIdProducto());
		validarNoNulo(producto);
		validarCantidad(producto.getCantidad());
		producto.setCantidad(producto.getCantidad() - 1);
		reserva.setFechaReserva(validarFechas(reserva.getFechaReserva()));
		this.repositorioProducto.actualizar(producto);
		return this.repositorioReserva.crear(reserva);
	} 
	
	public void validarNoNulo(Object valor) {
        if (valor == null) {
            throw new ExcepcionSinDatos(EL_PRODUCTO_NO_EXISTE_EN_EL_SISTEMA);
        }
    }
	
	public void validarCantidad(Long cantidad) {
   	 if (cantidad == 0) {
            throw new ExcepcionSinDatos(NO_HAY_EXISTENCIAS_DISPONIBLES);
        }
   }
}
