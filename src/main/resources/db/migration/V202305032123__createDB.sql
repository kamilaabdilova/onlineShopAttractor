create table users
(
    id       bigserial
        primary key,
    account  varchar(25) not null ,
    age      integer,
    email    varchar(255) not null unique ,
    name     varchar(25) not null ,
    password varchar(255) not null
);

create table baskets
(
    id      bigserial primary key,
    user_id bigint
        constraint fk87s17cinc4wkx0taas5nh0s8h references users
);

create table products
(
    id          bigserial primary key,
    category    varchar(255) not null,
    description varchar(255),
    image_url   varchar(255) not null,
    name        varchar(255),
    price       integer      not null,
    quantity    integer not null default 1,
    basket_id   bigint
        constraint fkgkhxc6xrc41edoa63km5lvurp references baskets
);

create table reviews
(
    id         bigserial
        primary key,
    comment    varchar(255),
    time       timestamp,
    username   varchar(255),
    product_id bigint
        constraint fkpl51cejpw4gy5swfar8br9ngi
            references products
);

INSERT INTO users (id, name, age, email, account, password) VALUES (1, 'John', 30,'john@gmail.com', 'john25', 'john1');
INSERT INTO users (id, name, age, email, account, password) VALUES (2, 'Mary', 25,'mary@gmail.com', 'mary56', 'mar45');

INSERT INTO products (id, name, description, price, image_url, quantity, category)
VALUES (1, 'Футболка с логотипом', 'Классическая футболка с логотипом на груди', 29,
        'images/1.jpeg', 2, 'WOMAN'),
       (2, 'Джинсы', 'Классические джинсы на высокой посадке', 49, 'images/top522.jpg', 3, 'WOMAN'),
       (3, 'Куртка', 'Куртка с капюшоном и застежкой на молнии', 99, 'images/3.jpg', 4, 'WOMAN');