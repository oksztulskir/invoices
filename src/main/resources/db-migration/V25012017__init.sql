create TABLE users (
    id BIGINT NOT NULL AUTO_INCREMENT,
    creation_date DATETIME NOT NULL,
    modification_date DATETIME NOT NULL,
    login VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);