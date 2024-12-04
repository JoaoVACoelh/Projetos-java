-- Criando o banco de dados escola
CREATE DATABASE escola;

USE escola;

CREATE TABLE aluno (
    matricula INT PRIMARY KEY,
    CPF VARCHAR(11) UNIQUE,
    nome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(20), 
    endereco TEXT
);

CREATE TABLE curso (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    descricao TEXT,
    valor_mensalidade DECIMAL(10,2),
    data_criacao DATE
);

CREATE TABLE unidade_curricular (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    descricao TEXT,
    data_inicio DATE,
    data_termino DATE,
    carga_horaria INT
);

INSERT INTO aluno (matricula, CPF, nome, data_nascimento, telefone, endereco)
VALUES (12345, '12345678901', 'João Vitor', '2005-06-05', '(11) 98765-4321', 'Rua'),
(5555, '17852376129', 'João perdro', '2005-06-05', '(11) 98765-4321', 'Rua');

INSERT INTO curso (nome, descricao, valor_mensalidade, data_criacao)
VALUES ('Engenharia de Software', 'Curso de programação em Java', 500.00, '2023-01-01');

INSERT INTO unidade_curricular (nome, descricao, data_inicio, data_termino, carga_horaria)
VALUES ('UNA', 'Faculdade','2023-01-01','2028-01-01',5);

SELECT * FROM aluno;
SELECT * FROM curso;
SELECT * FROM unidade_curricular;

UPDATE aluno SET telefone = '(11) 11111-1111' WHERE matricula = 12345;

DELETE FROM aluno WHERE matricula = 5555;


