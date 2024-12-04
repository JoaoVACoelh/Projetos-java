create database empresa;

use empresa;

CREATE TABLE produto (
    id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(128) NOT NULL,
    preco DOUBLE NOT NULL,
    validade DATE NOT NULL,
    UNIQUE (nome),
    CONSTRAINT pk_produto PRIMARY KEY (id)
);

CREATE TABLE identificacao (
    id INT NOT NULL,
    nome VARCHAR(128) NOT NULL,
    descricao VARCHAR(256) NOT NULL,
    CONSTRAINT pk_identificacao PRIMARY KEY (id),
    CONSTRAINT fk_identificacao FOREIGN KEY (id)
        REFERENCES produto (id)
);

insert into produto (nome, preco, validade) values ('arroz', 16.57, '2023-12-17');
insert into produto (nome, preco, validade) values ('detergente', 3.97, '2037-08-23');
insert into produto (nome, preco, validade) values ('calça', 184.91, '2045-01-27');
insert into produto (nome, preco, validade) values ('desinfetante', 8.60, '2036-02-14');
insert into produto (nome, preco, validade) values ('camisa', 48.99, '2043-04-03');
insert into produto (nome, preco, validade) values ('feijão', 12.31, '2023-09-11');
insert into produto (nome, preco, validade) values ('vestido', 89.99, '2041-05-16');
insert into produto (nome, preco, validade) values ('leite', 4.28, '2023-10-03');
insert into produto (nome, preco, validade) values ('sabão', 1.85, '2035-03-05');

insert into identificacao (id, nome, descricao) values (1, 'parboilizado', 'pré-cozido');
insert into identificacao (id, nome, descricao) values (2, 'neutro', 'sem corante e aditivos');
insert into identificacao (id, nome, descricao) values (3, 'jeans', 'reta');
insert into identificacao (id, nome, descricao) values (4, 'cloro', 'bactericida');
insert into identificacao (id, nome, descricao) values (5, 'algodão', 'sem estampa');
insert into identificacao (id, nome, descricao) values (6, 'carioca', 'orgânico');
insert into identificacao (id, nome, descricao) values (7, 'algodão', 'estampado');
insert into identificacao (id, nome, descricao) values (8, 'integral', 'com vitaminas');
insert into identificacao (id, nome, descricao) values (9, 'barra', 'banho');

INSERT INTO produto (nome, preco, validade) VALUES ('sabonete', 2.99, '2024-01-01');
INSERT INTO identificacao (id, nome, descricao) VALUES (10, 'líquido', 'para mãos');

INSERT INTO produto (nome, preco, validade) VALUES ('camiseta', 39.99, '2024-02-01');
INSERT INTO identificacao (id, nome, descricao) VALUES (11, 'algodão', 'manga curta');

SELECT p.id, p.nome, i.descricao, p.preco FROM produto p
INNER JOIN identificacao i ON p.id = i.id
ORDER BY p.preco DESC;

SELECT p.id, p.nome, i.descricao, p.preco FROM produto p
INNER JOIN identificacao i ON p.id = i.id
ORDER BY p.nome ASC, p.preco DESC;

SELECT i.nome, SUM(p.preco) AS total_preco FROM produto p
INNER JOIN identificacao i ON p.id = i.id
GROUP BY i.nome;

SELECT i.nome, AVG(p.preco) AS media_preco FROM produto p
INNER JOIN identificacao i ON p.id = i.id
GROUP BY i.nome;

SELECT i.nome, SUM(p.preco) AS total_preco FROM produto p
INNER JOIN identificacao i ON p.id = i.id WHERE p.preco > 100
GROUP BY i.nome;

select nome as 'Nome dos Produtos', preco as 'Preço dos Produtos' from produto;

select * from produto order by preco asc;


CREATE TABLE livro (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100),
    autor VARCHAR(100)
);

CREATE TABLE det_livro (
    id INT PRIMARY KEY,
    num_paginas INT,
    editora VARCHAR(100),
    isbn VARCHAR(20),
    id_livro INT UNIQUE,
    FOREIGN KEY (id_livro) REFERENCES livro(id)
);

INSERT INTO livro (titulo, autor) VALUES
    ('O Senhor dos Anéis', 'J.R.R. Tolkien'),
    ('1984', 'George Orwell'),
    ('O Pequeno Príncipe', 'Antoine de Saint-Exupéry');

INSERT INTO det_livro (id, num_paginas, editora, id_livro) VALUES
    (1, 1170, 'Martins Fontes', 1),
    (2, 328, 'Editora Globo', 2),
    (3, 96, 'Editora Globo', 3);
    
SELECT l.titulo, dl.num_paginas, dl.editora FROM livro l
INNER JOIN det_livro dl ON l.id = dl.id_livro
ORDER BY dl.num_paginas ASC;

SELECT dl.editora, COUNT(*) AS total_livros FROM livro l
INNER JOIN det_livro dl ON l.id = dl.id_livro
GROUP BY dl.editora;