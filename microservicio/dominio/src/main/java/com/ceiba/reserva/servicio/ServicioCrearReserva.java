package com.ceiba.reserva.servicio;

import static com.ceiba.dominio.ValidadorArgumento.*;
import static com.ceiba.dominio.constantes.ConstantesUtil.*;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.dao.DaoProducto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;


public class ServicioCrearReserva {

    private final RepositorioReserva repositorioReserva;
    
    private final DaoProducto daoProducto;
    
    private final RepositorioProducto repositorioProducto;

    public ServicioCrearReserva(RepositorioReserva repositorioReserva, DaoProducto daoProducto, RepositorioProducto repositorioProducto) {
        this.repositorioReserva = repositorioReserva;
        this.daoProducto = daoProducto;
        this.repositorioProducto = repositorioProducto;
    }

    public Long ejecutar(Reserva reserva) {
    	Producto producto = this.daoProducto.buscarPorId(reserva.getIdProducto());
    	validarNoNulo(producto, EL_PRODUCTO_NO_EXISTE_EN_EL_SISTEMA);
    	validarCantidad(producto.getCantidad(), NO_HAY_EXISTENCIAS_DISPONIBLES);
		producto.setCantidad(producto.getCantidad() - 1);
		this.repositorioProducto.actualizar(producto);
        return this.repositorioReserva.crear(reserva);
    }

}
