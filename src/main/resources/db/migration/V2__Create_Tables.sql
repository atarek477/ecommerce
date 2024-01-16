CREATE TABLE product (
    id   BIGSERIAL PRIMARY KEY,
    name TEXT      NOT NULL
);

CREATE TABLE categories (
    id   BIGSERIAL PRIMARY KEY,
    name TEXT      NOT NULL
);

CREATE TABLE product_categories (
    product_id    BIGINT REFERENCES product(id),
    category_id   BIGINT REFERENCES categories(id),
    PRIMARY KEY(product_id, category_id)
);
