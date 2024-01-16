--product_table
INSERT INTO product (name)  --1
VALUES ('HP Laptop 15');
INSERT INTO product (name)  --2
VALUES ('iPhone 15');
INSERT INTO product (name)  --3
VALUES ('Samsung S23');
INSERT INTO product (name)  --4
VALUES ('Samsung LED Screen');

--categories_table
INSERT INTO categories(name)  --1
VALUES ('Laptops');
INSERT INTO categories(name)  --2
VALUES ('Mobile');
INSERT INTO categories(name)  --3
VALUES ('TVs');
INSERT INTO categories(name)  --4
VALUES ('Computers');
INSERT INTO categories(name)  --5
VALUES ('Electronics');
INSERT INTO categories(name)  --6
VALUES ('HP');
INSERT INTO categories(name)  --7
VALUES ('Apple');
INSERT INTO categories(name)  --8
VALUES ('Samsung');

--product_categories
INSERT INTO product_categories
VALUES (1,1);
INSERT INTO product_categories
VALUES (1,4);
INSERT INTO product_categories
VALUES (1,5);
INSERT INTO product_categories
VALUES (1,6);
INSERT INTO product_categories
VALUES (2,2);
INSERT INTO product_categories
VALUES (2,5);
INSERT INTO product_categories
VALUES (2,7);
INSERT INTO product_categories
VALUES (3,2);
INSERT INTO product_categories
VALUES (3,5);
INSERT INTO product_categories
VALUES (3,8);
INSERT INTO product_categories
VALUES (4,3);
INSERT INTO product_categories
VALUES (4,5);
INSERT INTO product_categories
VALUES (4,8);


