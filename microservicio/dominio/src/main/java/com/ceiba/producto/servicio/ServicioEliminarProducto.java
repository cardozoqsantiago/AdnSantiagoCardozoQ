package com.ceiba.producto.servicio;

import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.dao.DaoProducto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import static com.ceiba.dominio.ValidadorArgumento.*;
import static com.ceiba.dominio.constantes.ConstantesUtil.*;

public class ServicioEliminarProducto {

	private final RepositorioProducto repositorioProducto;

	private final DaoProducto daoProducto;

	public ServicioEliminarProducto(RepositorioProducto repositorioProducto, DaoProducto daoProducto) {
		this.repositorioProducto = repositorioProducto;
		this.daoProducto = daoProducto;
	}

	public void ejecutar(Long id) {
		Producto producto = this.daoProducto.buscarPorId(id);
		validarNoNulo(producto, EL_PRODUCTO_NO_EXISTE_EN_EL_SISTEMA);
		validarEliminar(producto, id);

	}

	public void ejecutarTodo(Long id) {
		Producto producto = this.daoProducto.buscarPorId(id);
		validarNoNulo(producto, EL_PRODUCTO_NO_EXISTE_EN_EL_SISTEMA);
		this.repositorioProducto.eliminar(id);

	}

	private void validarEliminar(Producto producto, Long id) {
		if (producto.getCantidad() > 1) {
			producto.setCantidad(producto.getCantidad() - 1);
			this.repositorioProducto.actualizar(producto);
		} else {
			this.repositorioProducto.eliminar(id);
		}
	}
}
