CREATE TABLE playlists_podcast(
    id INT PRIMARY KEY AUTO_INCREMENT,
    playlist_id INT,
    podcast_id INT,
    FOREIGN KEY (playlist_id) REFERENCES PLAYLISTS_TABLE (id),
    FOREIGN KEY (podcast_id) REFERENCES PODCAST_TABLE(id)
)