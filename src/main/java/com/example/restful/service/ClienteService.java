package com.example.restful.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.restful.entity.Cliente;
import com.example.restful.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> listarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> listarPorNome(String nome) {
        return clienteRepository.findByNomeContainingIgnoreCase(nome);
    }
}

