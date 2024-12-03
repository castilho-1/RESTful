package com.example.restful.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.restful.entity.Pedido;
import com.example.restful.repository.ClienteRepository;
import com.example.restful.repository.PedidoRepository;
import com.example.restful.repository.ProdutoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final ProdutoRepository produtoRepository;

    public Pedido salvar(Pedido pedido) {
        if (!clienteRepository.existsById(pedido.getIdCliente())) {
            throw new IllegalArgumentException("Cliente inválido.");
        }
        if (pedido.getIdsProdutos().isEmpty() || 
            produtoRepository.findAllById(pedido.getIdsProdutos()).isEmpty()) {
            throw new IllegalArgumentException("Produto(s) inválido(s).");
        }
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> listarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public List<Pedido> listarPorCliente(Long idCliente) {
        return pedidoRepository.findByIdCliente(idCliente);
    }

    public List<Pedido> listarPorProduto(Long idProduto) {
        return pedidoRepository.findByIdsProdutosContaining(idProduto);
    }
}
