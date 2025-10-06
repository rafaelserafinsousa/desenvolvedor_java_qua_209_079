
-- Tabela INGREDIENTES
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (1, 'frango');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (2, 'carne bovina');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (3, 'queijo');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (4, 'ovo');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (5, 'tomate');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (6, 'alface');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (7, 'molho de soja');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (8, 'arroz');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (9, 'feijão');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (10, 'peixe');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (11, 'camarão');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (12, 'batata');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (13, 'pão');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (14, 'massa de pizza');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (15, 'molho de tomate');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (16, 'alho');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (17, 'cebola');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (18, 'cogumelo');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (19, 'pepino');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (20, 'massa de lasanha');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (21, 'massa de espaguete');

-- Tabela ALERGIA
INSERT INTO alergia (id_alergia, nome) VALUES (1, 'gluten');
INSERT INTO alergia (id_alergia, nome) VALUES (2, 'lactose');
INSERT INTO alergia (id_alergia, nome) VALUES (3, 'frutos do mar');
INSERT INTO alergia (id_alergia, nome) VALUES (4, 'ovo');
INSERT INTO alergia (id_alergia, nome) VALUES (5, 'peixe');
INSERT INTO alergia (id_alergia, nome) VALUES (6, 'soja');

-- Tabela RESTAURANTE
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (1, 'Sabor da Casa', 'Rua das Flores, 123'); 
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (2, 'Cantinho da Esquina', 'Av. Central, 456'); 
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (3, 'Delícias do Chef', 'Praça da Paz, 789'); 
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (4, 'Grill & Grill', 'Rua dos Pioneiros, 101'); 
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (5, 'Pasta e Pizza', 'Rua Itália, 22'); 
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (6, 'Temaki House', 'Av. Japão, 333'); 
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (7, 'Veggie Delight', 'Rua Verde, 44'); 
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (8, 'Burger King', 'Av. dos Estados, 12'); 
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (9, 'Mariscos do Mar', 'Praça do Mar, 77'); 
INSERT INTO restaurante (id_restaurante, nome, endereco) VALUES (10, 'Lanchonete Boa Hora', 'Rua Lanches, 5');

-- Tabela PRATOS
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (1, 'Feijoada', 1);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (2, 'Frango Grelhado', 4);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (3, 'Pizza Margherita', 5);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (4, 'Lasanha Bolonhesa', 5);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (5, 'Sushi Variado', 6);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (6, 'Yakissoba', 6);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (7, 'Hambúrguer Clássico', 8);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (8, 'Batata Frita', 8);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (9, 'Moqueca de Peixe', 9);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (10, 'Camarão na Moranga', 3);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (11, 'Salada Veggie', 7);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (12, 'Wrap de Legumes', 7);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (13, 'Espaguete à Bolonhesa', 5);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (14, 'Frango ao Curry', 2);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (15, 'Bife Acebolado', 1);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (16, 'Peixe Grelhado', 4);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (17, 'Risoto de Camarão', 3);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (18, 'Omelete', 10);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (19, 'Hambúrguer Vegano', 7);
INSERT INTO pratos (id_prato, nome, id_restaurante) VALUES (20, 'Pizza Pepperoni', 5);

-- Tabela INGREDIENTE_ALERGIA
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (3, 2);  -- queijo -> lactose
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (4, 4);  -- ovo -> ovo
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (7, 6);  -- molho de soja -> soja
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (7, 1);  -- molho de soja -> glúten (muitos contêm trigo)
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (10, 5); -- peixe -> peixe
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (11, 3); -- camarão -> frutos do mar
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (13, 1); -- pão -> glúten
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (14, 1); -- massa de pizza -> glúten
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (20, 1); -- massa de lasanha -> glúten
INSERT INTO ingrediente_alergia (ingrediente_id, alergia_id) VALUES (21, 1); -- massa de espaguete -> glúten

-- Tabela PRATO_INGREDIENTE
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (1, 9);   -- Feijoada -> feijão
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (1, 8);   -- Feijoada -> arroz
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (2, 1);   -- Frango Grelhado -> frango
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (3, 14);  -- Pizza Margherita -> massa de pizza
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (3, 3);   -- Pizza Margherita -> queijo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (3, 15);  -- Pizza Margherita -> molho de tomate
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (4, 20);  -- Lasanha Bolonhesa -> massa de lasanha
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (4, 2);   -- Lasanha Bolonhesa -> carne bovina
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (4, 3);   -- Lasanha Bolonhesa -> queijo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (5, 10);  -- Sushi Variado -> peixe
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (5, 8);   -- Sushi Variado -> arroz
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (6, 1);   -- Yakissoba -> frango
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (6, 7);   -- Yakissoba -> molho de soja
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (7, 13);  -- Hambúrguer Clássico -> pão
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (7, 2);   -- Hambúrguer Clássico -> carne bovina
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (7, 3);   -- Hambúrguer Clássico -> queijo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (7, 6);   -- Hambúrguer Clássico -> alface
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (8, 12);  -- Batata Frita -> batata
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (9, 10);  -- Moqueca de Peixe -> peixe
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (10, 11); -- Camarão na Moranga -> camarão
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (11, 5);  -- Salada Veggie -> tomate
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (11, 6);  -- Salada Veggie -> alface
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (12, 5);  -- Wrap de Legumes -> tomate
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (12, 19); -- Wrap de Legumes -> pepino
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (13, 21); -- Espaguete à Bolonhesa -> massa de espaguete
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (13, 2);   -- Espaguete à Bolonhesa -> carne bovina
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (14, 1);  -- Frango ao Curry -> frango
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (15, 2);  -- Bife Acebolado -> carne bovina
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (15, 17); -- Bife Acebolado -> cebola
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (16, 10); -- Peixe Grelhado -> peixe
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (17, 11); -- Risoto de Camarão -> camarão
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (17, 8);  -- Risoto de Camarão -> arroz
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (18, 4);  -- Omelete -> ovo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (19, 13); -- Hambúrguer Vegano -> pão
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (19, 18); -- Hambúrguer Vegano -> cogumelo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (19, 5);  -- Hambúrguer Vegano -> tomate
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (20, 14); -- Pizza Pepperoni -> massa de pizza
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (20, 3);  -- Pizza Pepperoni -> queijo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (20, 15); -- Pizza Pepperoni -> molho de tomate
