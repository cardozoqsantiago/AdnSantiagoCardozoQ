package com.ceiba.producto.controlador;
//package com.ceiba.usuario.controlador;
//
//import java.util.List;
//
//import com.ceiba.producto.consulta.ManejadorListarProductos;
//import com.ceiba.producto.modelo.dto.DtoProducto;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//
//@RestController
//@RequestMapping("/usuarios")
//@Api(tags={"Controlador consulta usuario"})
//public class ConsultaControladorProducto {
//
//    private final ManejadorListarProductos manejadorListarUsuarios;
//
//    public ConsultaControladorProducto(ManejadorListarProductos manejadorListarUsuarios) {
//        this.manejadorListarUsuarios = manejadorListarUsuarios;
//    }
//
//    @GetMapping
//    @ApiOperation("Listar Usuarios")
//    public List<DtoProducto> listar() {
//        return this.manejadorListarUsuarios.ejecutar();
//    }
//
//}
