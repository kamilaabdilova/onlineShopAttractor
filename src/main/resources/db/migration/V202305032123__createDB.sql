CREATE TABLE users (
                      id INT PRIMARY KEY,
                      name VARCHAR(50) not null ,
                      email varchar(45) not null UNIQUE,
                      password varchar(200) not null,
                      account varchar(25) not null ,
                      age INT

);
INSERT INTO users (id, name, age, email, account, password) VALUES (1, 'John', 30,'john@gmail.com', 'john25', 'john1');
INSERT INTO users (id, name, age, email, account, password) VALUES (2, 'Mary', 25,'mary@gmail.com', 'mary56', 'mar45');

CREATE TABLE products
(
    id          INT PRIMARY KEY,
    name        VARCHAR(255)   NOT NULL,
    description TEXT,
    price       int NOT NULL,
    image_url   VARCHAR(255),
    quantity INT not null default 1,
    category varchar not null,
);


INSERT INTO products (id, name, description, price, image_url, quantity, category)
VALUES (1, 'Футболка с логотипом', 'Классическая футболка с логотипом на груди', 29,
        'images/1.jpeg', 2, 'WOMAN'),
       (2, 'Джинсы', 'Классические джинсы на высокой посадке', 49, 'images/top522.jpg', 3, 'WOMAN'),
       (3, 'Куртка', 'Куртка с капюшоном и застежкой на молнии', 99, 'images/3.jpg', 4, 'WOMAN');

