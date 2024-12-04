CREATE DATABASE oficina;

USE oficina;

CREATE TABLE cliente (
    CPF VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(20),
    endereco TEXT
);

CREATE TABLE veiculo (
    placa VARCHAR(9) PRIMARY KEY,
    chassi VARCHAR(17),
    modelo VARCHAR(50),
    marca VARCHAR(50),
    ano INT
);

CREATE TABLE mecanico (
    CPF VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(20),
    endereco TEXT,
    salario DECIMAL(10,2)
);

INSERT INTO cliente (CPF, nome, data_nascimento, telefone, endereco)
VALUES ('12345678901', 'João Vitor', '2005-06-05', '(11) 12312-1231', 'Rua'),
('17852376129', 'João Perdro', '2005-06-05', '(11) 98765-4321', 'Rua');

INSERT INTO veiculo (chassi, placa, modelo, marca, ano)
VALUES ('PADRAO', 'AAA-12A21', 'FORD KA', 'FORD', 2018);

INSERT INTO mecanico (CPF, nome, data_nascimento, telefone, endereco, salario)
VALUES ('98765432109', 'Maria Clara', '2009-07-01', '(11) 97654-3210', 'Rua', 3000.00);

SELECT * FROM mecanico;

SELECT * FROM cliente;

UPDATE mecanico SET salario = 6000.00 WHERE cpf = '98765432109';

TRUNCATE TABLE cliente;

DELETE FROM cliente WHERE cpf = '12345678901';

