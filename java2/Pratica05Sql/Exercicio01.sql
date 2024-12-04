use empresa;

create table fornecedor2(
id int auto_increment,
nome varchar(128) not null,
telefone varchar(24) not null,
endereco varchar(128) not null,
unique(nome),
constraint pk_fornecedor primary key(id)
);
create table produto3(
id int auto_increment,
id_fornecedor int not null,
nome varchar(128) not null,
preco double not null,
validade date not null,
unique(nome),
constraint pk_produto primary key(id),
constraint fk_produto foreign key(id_fornecedor) references fornecedor(id)
);
create table identificacao3(
id int,
nome varchar(128) not null,
descricao varchar(256) not null,
constraint pk_identificacao primary key(id),
constraint fk_identificacao foreign key(id) references produto(id)
);
create table filial(
cnpj varchar(18),
nome varchar(128) not null,
telefone varchar(24) not null,
endereco varchar(128) not null,
constraint pk_filial primary key(cnpj)
);
create table estoque(
id_produto int,
cnpj_filial varchar(18) not null,
quantidade int default 0,
constraint pk_estoque primary key(id_produto, cnpj_filial),
constraint fk_estoque_produto foreign key(id_produto) references produto(id),
constraint fk_estoque_filial foreign key(cnpj_filial) references filial(cnpj)
);

insert into fornecedor2 (nome, telefone, endereco) values
('Doravante Alimentos S.A.', '+55 (31) 9 9743-6521', 'Rua 1, n. 1, Parque do Sol'),
('Trajos Vestuário LTDA', '+55 (21) 9 9873-2955', 'Rua 2, n. 2, Pedra de Guaratiba'),
('Esmero Limpeza LTDA', '+55 (11) 9 9724-8131', 'Rua 3, n. 3, Moema');

insert into produto3(id_fornecedor, nome, preco, validade) values
(1, 'arroz', 16.57, '2023-12-17'),
(3, 'detergente', 3.97, '2037-08-23'),
(2, 'calça', 184.91, '2045-01-27'),
(3, 'desinfetante', 8.60, '2036-02-14'),
(2, 'camisa', 48.99, '2043-04-03'),
(1, 'feijão', 12.31, '2023-09-11'),
(2, 'vestido', 89.99, '2041-05-16'),
(1, 'leite', 4.28, '2023-10-03'),
(3, 'sabão', 1.85, '2035-03-05');

insert into identificacao3 values
(1, 'parboilizado', 'pré-cozido'),
(2, 'neutro', 'sem corante e aditivos'),
(3, 'jeans', 'reta'),
(4, 'cloro', 'bactericida'),
(5, 'algodão', 'sem estampa'),
(6, 'carioca', 'orgânico'),
(7, 'algodão', 'estampado'),
(8, 'integral', 'com vitaminas'),
(9, 'barra', 'banho');

insert into filial values
('01.678.277/0109-87', 'Barreiro', '+55 (31) 9 8749-6421', 'Rua 4, n. 4, Barreiro'),
('02.876.722/0202-55', 'Contagem', '+55 (31) 9 5432-1001', 'Rua 5, n. 5, Industrial'),
('03.987.311/0302-45', 'Betim', '+55 (31) 9 6789-0220', 'Rua 6, n. 6, Alterosas');

insert into estoque values
(1, '01.678.277/0109-87', 10),
(2, '02.876.722/0202-55', 20),
(3, '03.987.311/0302-45', 30),
(4, '01.678.277/0109-87', 40),

(5, '02.876.722/0202-55', 50),
(6, '03.987.311/0302-45', 60),
(7, '01.678.277/0109-87', 70);

insert into estoque(id_produto, cnpj_filial) values
(8, '02.876.722/0202-55'),
(9, '03.987.311/0302-45'),
(10, '01.678.277/0109-87'),
(11, '01.678.277/0109-87');

select p.nome 'Prodduto', e.quantidade 'Quantidade', f.nome 'Filial', f.telefone 'Telefone', f.endereco 'Endereço'
FROM produto3 p, estoque e, filial f
where p.id = e.id_produto and e.cnpj_filial = f.cnpj;


SELECT p.nome AS Produto, SUM(e.quantidade * p.preco) AS Valor_Total FROM produto3 p 
INNER JOIN estoque e ON p.id = e.id_produto GROUP BY p.nome
ORDER BY Valor_Total DESC;

SELECT f.nome AS Filial, SUM(p.preco * e.quantidade) AS Valor_Total_Filial FROM filial f
INNER JOIN estoque e ON f.cnpj = e.cnpj_filial
INNER JOIN produto3 p ON e.id_produto = p.id GROUP BY f.nome
ORDER BY Valor_Total_Filial DESC;

INSERT INTO fornecedor2 (nome, telefone, endereco)
VALUES ('TERABYTE', '+55 (11) 98765-4321', 'Avenida Principal, 123');

INSERT INTO produto3 (id_fornecedor, nome, preco, validade)
VALUES (LAST_INSERT_ID(), 'TECLADO', 300, '2024-12-31');

insert into identificacao3 values
(10, 'GAMER', 'MECANICO');

UPDATE estoque SET quantidade = quantidade + 5000
WHERE id_produto = 11  AND cnpj_filial = '01.678.277/0109-87';

SELECT f.nome AS Filial, SUM(p.preco * e.quantidade) AS Valor_Total_Estoque FROM filial f
INNER JOIN estoque e ON f.cnpj = e.cnpj_filial
INNER JOIN produto3 p ON e.id_produto = p.id GROUP BY f.nome
HAVING SUM(p.preco * e.quantidade) > 10000
ORDER BY Valor_Total_Estoque DESC;

SELECT * FROM estoque;

Select * from produto3;