package com.espro.falatudopodcast.podcasts;

import com.espro.falatudopodcast.playlists.PlaylistModel;
import com.espro.falatudopodcast.users.UserModel;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "podcast_table")
public class PodcastModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String podcastName;

    @Column(name = "podcast_url")
    private String podcastUrl;

    @ManyToMany(mappedBy = "podcasts")
    private List<PlaylistModel> playlists;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private UserModel user;


}
