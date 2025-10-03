INSERT INTO ingredientes (id_ingrediente, nome) VALUES
(1,'Glúten'),
(2,'Leite'),
(3,'Ovo'),
(4,'Amendoim'),
(5,'Frutos do Mar'),
(6,'Soja'),
(7,'Aveia'),
(8,'Castanha'),
(9,'Peixe'),
(10,'Camarão'),
(11,'Tomate'),
(12,'Queijo'),
(13,'Chocolate'),
(14,'Cebola'),
(15,'Alho');

INSERT INTO alergia (id_alergia, nome) VALUES
(1,'Glúten'),
(2,'Leite'),
(3,'Ovo'),
(4,'Amendoim'),
(5,'Frutos do Mar'),
(6,'Soja'),
(7,'Aveia'),
(8,'Castanha'),
(9,'Peixe'),
(10,'Camarão');

INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES
(1,'Pizza de Queijo', 1),
(2,'Omelete', 1),
(3,'Sushi de Salmão', 2),
(4,'Camarão na Moranga', 2),
(5,'Brownie de Chocolate', 1),
(6,'Salada Caesar', 3),
(7,'Macarrão ao Molho', 4),
(8,'Feijoada', 7),
(9,'Panqueca', 4),
(10,'Frango Grelhado', 3);

-- Pizza de Queijo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(1,1),(1,2),(1,3),(1,12),(1,11);

-- Omelete
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(2,3),(2,2),(2,12),(2,14);

-- Sushi de Salmão
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(3,9),(3,6),(3,11);

-- Camarão na Moranga
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(4,10),(4,15),(4,14);

-- Brownie de Chocolate
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(5,13),(5,3),(5,2),(5,1);

-- Salada Caesar
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(6,11),(6,12),(6,3);

-- Macarrão ao Molho
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(7,1),(7,11),(7,15),(7,12);

-- Feijoada
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(8,14),(8,15);

-- Panqueca
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(9,1),(9,2),(9,3);

-- Frango Grelhado
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES
(10,15),(10,11),(10,14);

INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES
(1,'Restaurante A','Rua 1'),
(2,'Restaurante B','Rua 2'),
(3,'Restaurante C','Rua 3'),
(4,'Restaurante D','Rua 4'),
(5,'Restaurante E','Rua 5'),
(6,'Restaurante F','Rua 6'),
(7,'Restaurante G','Rua 7'),
(8,'Restaurante H','Rua 8'),
(9,'Restaurante I','Rua 9'),
(10,'Restaurante J','Rua 10');

INSERT INTO restaurante_prato (restaurante_id, prato_id) VALUES
(1,1),(1,2),(1,5),
(2,3),(2,4),
(3,6),(3,10),
(4,7),(4,9),
(5,1),(5,7),
(6,2),(6,6),
(7,3),(7,8),
(8,4),(8,9),
(9,10),(9,1),
(10,5),(10,8);

INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES
(1,1),(2,2),(3,3),(4,4),(5,5),
(6,6),(7,7),(8,8),(9,9),(10,10);
