package com.example.restful.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.restful.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByIdCliente(Long idCliente);
    List<Pedido> findByIdsProdutosContaining(Long idProduto);
}
