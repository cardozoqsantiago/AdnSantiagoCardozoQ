package com.ceiba.producto.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.producto.comando.ComandoProducto;
import com.ceiba.producto.modelo.entidad.Producto;

@Component
public class FabricaProducto {

    public Producto crear(ComandoProducto comandoProducto) {
        return new Producto(
        		comandoProducto.getId(),
        		comandoProducto.getNombre(),
        		comandoProducto.getTipoProducto(),
        		comandoProducto.getCantidad(),
        		comandoProducto.getPrecio()
        );
    }
}
