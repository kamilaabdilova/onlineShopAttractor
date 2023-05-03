CREATE TABLE products
(
    id          INT PRIMARY KEY,
    name        VARCHAR(255)   NOT NULL,
    description TEXT,
    price       DECIMAL(10, 2) NOT NULL,
    image_url   VARCHAR(255)
);


INSERT INTO products (id, name, description, price, image_url)
VALUES (1, 'Футболка с логотипом', 'Классическая футболка с логотипом на груди', 29.99,
        'https://example.com/images/product1.jpg'),
       (2, 'Джинсы', 'Классические джинсы с натуральной посадкой', 49.99, 'https://example.com/images/product2.jpg'),
       (3, 'Куртка', 'Куртка с капюшоном и застежкой на молнии', 99.99, 'https://example.com/images/product3.jpg');

