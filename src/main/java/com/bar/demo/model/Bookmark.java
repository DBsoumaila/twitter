package com.bar.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "tweetid"
    )
    private Tweet tweet;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "userid"
    )
    private Utilisateur user;

    public Bookmark(Tweet tweet, Utilisateur user) {
        this.tweet = tweet;
        this.user = user;
    }
}
