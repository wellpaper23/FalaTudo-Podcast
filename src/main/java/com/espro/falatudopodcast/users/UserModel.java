package com.espro.falatudopodcast.users;


import com.espro.falatudopodcast.playlists.PlaylistModel;
import com.espro.falatudopodcast.podcasts.PodcastModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users_table")


public class UserModel {
    public UserModel() {
    }

    public UserModel(int id, String name, String username, String password, String email, int idade, String urlProfilePicture) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.idade = idade;
        this.urlProfilePicture = urlProfilePicture;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name= "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name= "age")
    private int idade;
    @Column(name= "url_profile_picture")
    private String urlProfilePicture;

    @OneToMany(mappedBy = "user")
    private List<PlaylistModel> playlists;
    @OneToMany(mappedBy = "user")
    private List<PodcastModel> podcasts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUrlProfilePicture() {
        return urlProfilePicture;
    }

    public void setUrlProfilePicture(String urlProfilePicture) {
        this.urlProfilePicture = urlProfilePicture;
    }
}
