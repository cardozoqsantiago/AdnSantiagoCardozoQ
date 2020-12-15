package com.ceiba.producto.controlador;

import java.util.List;

import com.ceiba.producto.consulta.ManejadorListarProductos;
import com.ceiba.producto.modelo.dto.DtoProducto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/productos")
@Api(tags={"Controlador consulta producto"})
public class ConsultaControladorProducto {

    private final ManejadorListarProductos manejadorListarProductos;

    public ConsultaControladorProducto(ManejadorListarProductos manejadorListarProductos) {
        this.manejadorListarProductos = manejadorListarProductos;
    }

    @GetMapping
    @ApiOperation("Listar Productos")
    public List<DtoProducto> listar() {
        return this.manejadorListarProductos.ejecutar();
    }

}
