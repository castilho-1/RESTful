package com.example.restful.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.restful.entity.Produto;
import com.example.restful.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto) {
        if (produto.getNome() == null || produto.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (produto.getPreco() < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        return produtoRepository.save(produto);
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> listarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public List<Produto> listarPorNome(String nome) {
        return produtoRepository.findByNomeContainingIgnoreCase(nome);
    }
}
