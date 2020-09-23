DROP TABLE IF EXISTS albums;

CREATE TABLE albums (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    image VARCHAR(255) DEFAULT NULL
);

INSERT INTO albums (id, title, author, image)
VALUES (1,'Test title', 'Test author', 'image'),
(2,'Test title2', 'Test author2', 'image');
