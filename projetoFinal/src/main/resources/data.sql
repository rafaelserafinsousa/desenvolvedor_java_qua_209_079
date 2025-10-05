-- ===============================
-- RESTAURANTES
-- ===============================
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

-- ===============================
-- INGREDIENTES
-- ============================
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (1, 'Frango');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (2, 'Carne bovina');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (3, 'Queijo');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (4, 'Ovo');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (5, 'Glúten');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (6, 'Tomate');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (7, 'Alface');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (8, 'Molho de soja');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (9, 'Arroz');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (10, 'Feijão');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (11, 'Peixe');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (12, 'Camarão');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (13, 'Batata');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (14, 'Pão');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (15, 'Massa de pizza');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (16, 'Molho de tomate');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (17, 'Alho');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (18, 'Cebola');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (19, 'Cogumelo');
INSERT INTO ingredientes (id_ingrediente, nome) VALUES (20, 'Pepino');

-- ==============================
-- PRATOS
-- ===============================
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (1, 'Feijoada', 1);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (2, 'Frango Grelhado', 1);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (3, 'Pizza Margherita', 5);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (4, 'Lasanha Bolonhesa', 5);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (5, 'Sushi Variado', 6);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (6, 'Yakissoba', 6);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (7, 'Hambúrguer Clássico', 8);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (8, 'Batata Frita', 8);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (9, 'Moqueca de Peixe', 9);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (10, 'Camarão na Moranga', 9);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (11, 'Salada Veggie', 7);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (12, 'Wrap de Legumes', 7);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (13, 'Espaguete à Bolonhesa', 5);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (14, 'Frango ao Curry', 4);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (15, 'Bife Acebolado', 4);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (16, 'Peixe Grelhado', 3);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (17, 'Risoto de Camarão', 3);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (18, 'Omelete', 1);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (19, 'Hambúrguer Vegano', 7);
INSERT INTO pratos (id_pratos, nome, restaurante_id) VALUES (20, 'Pizza Pepperoni', 5);

-- =============================
-- PRATO_INGREDIENTE
--  ==============================
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (1, 10); -- Feijão
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (1, 9);  -- Arroz
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (2, 1);  -- Frango
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (3, 3);  -- Queijo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (3, 5);  -- Glúten
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (3, 16); -- Molho de tomate
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (4, 3);  -- Queijo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (4, 5);  -- Glúten
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (5, 11); -- Peixe
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (5, 1);  -- Frango
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (6, 1);  -- Frango
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (6, 8);  -- Molho de soja
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (7, 2);  -- Carne bovina
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (7, 3);  -- Queijo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (8, 13); -- Batata
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (9, 11); -- Peixe
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (10, 12);-- Camarão
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (11, 6); -- Tomate
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (11, 7); -- Alface
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (12, 6); -- Tomate
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (12, 20);-- Pepino
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (13, 5); -- Glúten
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (13, 1); -- Frango
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (14, 1); -- Frango
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (15, 2); -- Carne bovina
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (16, 11);-- Peixe
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (17, 12);-- Camarão
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (18, 4); -- Ovo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (19, 6); -- Tomate
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (19, 7); -- Alface
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (20, 3); -- Queijo
INSERT INTO prato_ingrediente (prato_id, ingrediente_id) VALUES (20, 5); -- Glúten
