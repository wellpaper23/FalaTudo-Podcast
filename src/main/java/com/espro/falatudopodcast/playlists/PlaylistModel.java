package com.espro.falatudopodcast.playlists;

import com.espro.falatudopodcast.podcasts.PodcastModel;
import com.espro.falatudopodcast.users.UserModel;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "playlists_table")
public class PlaylistModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String playlistName;


    @ManyToMany
    @JoinTable(name = "playlists_podcast",
    joinColumns = @JoinColumn(name = "playlist_id"),inverseJoinColumns = @JoinColumn(name = "podcast_id"))
    private List<PodcastModel> podcasts ;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private UserModel user;


}
