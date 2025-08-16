
CREATE TABLE playlists_table (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    owner_id INTEGER,
    FOREIGN KEY (owner_id) REFERENCES users_table(id)
);