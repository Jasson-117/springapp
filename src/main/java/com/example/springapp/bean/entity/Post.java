package com.example.springapp.bean.entity;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post",nullable = false,unique = true)
    private Long id;
    @Column(name = "descripcion_post",length = 255)
    private String descripcion;
    @ManyToOne
    private User user;

    public Post() {
    }

    public Post(Long id, String descripcion, User user) {
        this.id = id;
        this.descripcion = descripcion;
        this.user = user;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", user=" + user +
                '}';
    }
}
