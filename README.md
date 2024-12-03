# RESTful API

Esta é uma API RESTful simples desenvolvida com Spring Boot. O objetivo do projeto é gerenciar clientes, produtos e pedidos, permitindo a criação, listagem e busca de dados relacionados.

## Funcionalidades

- **Clientes**:
  - Criar cliente
  - Listar todos os clientes
  - Buscar cliente por nome
  - Buscar cliente por ID

- **Produtos**:
  - Criar produto
  - Listar todos os produtos
  - Buscar produto por nome
  - Buscar produto por ID

- **Pedidos**:
  - Criar pedido
  - Listar todos os pedidos
  - Buscar pedidos por cliente
  - Buscar pedidos por produto
  - Buscar pedido por ID

## Tecnologias Utilizadas

- **Spring Boot**: Framework principal para o desenvolvimento da API.
- **Spring Data JPA**: Para a integração com o banco de dados.
- **H2 Database**: Banco de dados em memória para persistência.
- **Swagger UI**: Para documentação e interação com a API via interface gráfica.
- **Maven**: Gerenciador de dependências.

## Endpoints

### Clientes

- **POST /api/clientes**: Cria um novo cliente.
- **GET /api/clientes**: Retorna todos os clientes.
- **GET /api/clientes/{id}**: Retorna um cliente pelo ID.
- **GET /api/clientes/buscar?nome={nome}**: Retorna clientes filtrados pelo nome.

### Produtos

- **POST /api/produtos**: Cria um novo produto.
- **GET /api/produtos**: Retorna todos os produtos.
- **GET /api/produtos/{id}**: Retorna um produto pelo ID.
- **GET /api/produtos/buscar?nome={nome}**: Retorna produtos filtrados pelo nome.

### Pedidos

- **POST /api/pedidos**: Cria um novo pedido.
- **GET /api/pedidos**: Retorna todos os pedidos.
- **GET /api/pedidos/{id}**: Retorna um pedido pelo ID.
- **GET /api/pedidos/cliente/{idCliente}**: Retorna pedidos filtrados pelo ID do cliente.
- **GET /api/pedidos/produto/{idProduto}**: Retorna pedidos filtrados pelo ID do produto.

## Requisitos

- **Java 17** ou superior
- **Maven** para gerenciar dependências
- **Spring Boot** para rodar a aplicação

## Como Executar o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/castilho-1/RESTful.git
