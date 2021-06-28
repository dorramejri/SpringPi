CREATE TABLE users
(
    id BIGINT(50) NOT NULL AUTO_INCREMENT,
    name VARCHAR(44),
    email VARCHAR(44),
    phone VARCHAR(44),
    address VARCHAR(44),
    password VARCHAR(44),
    updatepass DATE,
   PRIMARY KEY (id)
) ENGINE = InnoDb;

CREATE TABLE simple
(
	id BIGINT(50) NOT NULL AUTO_INCREMENT,
    promo BOOLEAN,
    description VARCHAR(44),
    enddate DATE,
    PRIMARY KEY (id)
) ENGINE = InnoDb;