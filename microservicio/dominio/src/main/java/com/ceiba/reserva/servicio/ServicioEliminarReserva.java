package com.ceiba.reserva.servicio;

import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.dao.DaoProducto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;
import static com.ceiba.dominio.ValidadorArgumento.*;
import static com.ceiba.dominio.constantes.ConstantesUtil.*;

public class ServicioEliminarReserva {

    private final RepositorioReserva repositorioReserva;
    
    private final DaoReserva daoReserva;
    
    private final RepositorioProducto repositorioProducto;
    
    private final DaoProducto daoProducto;

    public ServicioEliminarReserva(RepositorioReserva repositorioReserva, DaoReserva daoReserva,
    		RepositorioProducto repositorioProducto, DaoProducto daoProducto) {
        this.repositorioReserva = repositorioReserva;
        this.daoReserva = daoReserva;
        this.repositorioProducto = repositorioProducto;
        this.daoProducto = daoProducto;
    }

    public void ejecutar(Long id) {
    	Reserva reserva = this.daoReserva.buscarPorId(id);
    	validarNoNulo(reserva, LA_RESERVA_NO_EXISTE);
    	Producto producto = this.daoProducto.buscarPorId(reserva.getIdProducto());
    	validarNoNulo(producto, EL_PRODUCTO_NO_EXISTE_EN_EL_SISTEMA);
    	producto.setCantidad(producto.getCantidad() + 1);
    	this.repositorioProducto.actualizar(producto);
        this.repositorioReserva.eliminar(id);
    }
}
