CREATE DATABASE corretora;

USE corretora;

CREATE TABLE perfil_investidor (
    id INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(50)
);

CREATE TABLE cliente (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    agencia INT,
    conta INT,
    telefone VARCHAR(20),
    endereco TEXT,
    id_perfil INT,
    FOREIGN KEY (id_perfil) REFERENCES perfil_investidor(id)
);

CREATE TABLE ativo_financeiro (
    codigo VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT,
    emissor VARCHAR(100),
    data_inicio DATE,
    data_fim DATE
);

CREATE TABLE nota_corretagem (
    numero INT PRIMARY KEY AUTO_INCREMENT,
    data_compra DATE,
    cpf_cliente VARCHAR(11),
    codigo_ativo VARCHAR(20),
    quantidade INT,
    cotacao DECIMAL(10,2),
    valor_compra DECIMAL(10,2),
    custos DECIMAL(10,2),
    FOREIGN KEY (cpf_cliente) REFERENCES cliente(cpf),
    FOREIGN KEY (codigo_ativo) REFERENCES ativo_financeiro(codigo)
);

INSERT INTO perfil_investidor (descricao) VALUES ('Conservador'), ('Moderado'), ('Arrojado'), ('Sofisticado'), ('Agressivo');

INSERT INTO cliente (CPF, nome, data_nascimento, agencia, conta, telefone, endereco, id_perfil)
VALUES ('12345678901', 'João Vitor', '2005-06-05', 1233, 3321, '(11) 12312-1231', 'Rua', 1),
('17852376129', 'João Perdro', '2005-06-05', 3212, 7432, '(11) 98765-4321', 'Rua', 5);

SELECT * FROM cliente;

SELECT * FROM cliente WHERE id_perfil = 1;

UPDATE cliente SET id_perfil = 5 WHERE id_perfil = 1;

DELETE FROM cliente WHERE id_perfil = 5;



