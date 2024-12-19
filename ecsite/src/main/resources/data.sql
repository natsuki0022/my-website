-- テーブルが存在しない場合に作成
CREATE TABLE IF NOT EXISTS product (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    price DECIMAL(10, 2)
);

-- サンプル商品データの挿入
INSERT INTO product (id, name, description, price) VALUES (1, 'Sample Product 1', 'Description of product 1', 100.0);
INSERT INTO product (id, name, description, price) VALUES (2, 'Sample Product 2', 'Description of product 2', 150.0);
INSERT INTO product (id, name, description, price) VALUES (3, 'Sample Product 3', 'Description of product 3', 200.0);
INSERT INTO product (id, name, description, price) VALUES (4, 'Sample Product 4', 'Description of product 4', 250.0);
INSERT INTO product (id, name, description, price) VALUES (5, 'Sample Product 5', 'Description of product 5', 300.0);
INSERT INTO product (id, name, description, price) VALUES (6, 'Sample Product 6', 'Description of product 6', 350.0);
INSERT INTO product (id, name, description, price) VALUES (7, 'Sample Product 7', 'Description of product 7', 400.0);
INSERT INTO product (id, name, description, price) VALUES (8, 'Sample Product 8', 'Description of product 8', 450.0);
INSERT INTO product (id, name, description, price) VALUES (9, 'Sample Product 9', 'Description of product 9', 500.0);
INSERT INTO product (id, name, description, price) VALUES (10, 'Sample Product 10', 'Description of product 10', 550.0);
