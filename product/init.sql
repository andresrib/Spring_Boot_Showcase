CREATE DATABASE IF NOT EXISTS Loja;

USE Loja;

CREATE TABLE IF NOT EXISTS Produtos (
    id INT AUTO_INCREMENT,
    nome VARCHAR(255),
    descricao VARCHAR(255),
    preco DOUBLE,
    disponivel BOOLEAN,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Pedidos (
    id INT AUTO_INCREMENT,
    data_pedido DATE,
    quantidade INT,
    status_pedido VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Lista (
    id INT AUTO_INCREMENT,
    produto_id INT,
    pedido_id INT,
    PRIMARY KEY (id),
    CONSTRAINT fk_produto_id FOREIGN KEY (produto_id) REFERENCES Produtos(id),
    CONSTRAINT fk_pedido_id FOREIGN KEY (pedido_id) REFERENCES Pedidos(id) ON DELETE CASCADE
);