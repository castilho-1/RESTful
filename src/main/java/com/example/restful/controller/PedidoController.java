package com.example.restful.controller;


import com.example.restful.entity.Pedido;
import com.example.restful.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;

    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido) {
        return pedidoService.salvar(pedido);
    }

    @GetMapping
    public List<Pedido> listarTodos() {
        return pedidoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> listarPorId(@PathVariable Long id) {
        return pedidoService.listarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/cliente/{idCliente}")
    public List<Pedido> listarPorCliente(@PathVariable Long idCliente) {
        return pedidoService.listarPorCliente(idCliente);
    }

    @GetMapping("/produto/{idProduto}")
    public List<Pedido> listarPorProduto(@PathVariable Long idProduto) {
        return pedidoService.listarPorProduto(idProduto);
    }
}
