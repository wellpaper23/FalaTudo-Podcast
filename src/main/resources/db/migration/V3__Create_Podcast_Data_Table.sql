
CREATE TABLE podcast_table (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    podcast_url VARCHAR(255),
    autor_id INTEGER,
    FOREIGN KEY (autor_id) REFERENCES users_table(ID)
);