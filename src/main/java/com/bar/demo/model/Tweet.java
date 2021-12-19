package com.bar.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "authorid"
    )
    private Utilisateur author;

    @Column(nullable = false)
    private String textualContent;

    @Lob
    private byte[] mediaContent;

    @Column(nullable = false)
    private LocalDateTime createdat;

    private LocalDateTime updatedAt;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<Utilisateur> usersMentioned = new ArrayList<Utilisateur>();

    private int countLikes = 0;

    @OneToMany(mappedBy = "tweet")
    private Collection<Response> responses;

    @OneToMany(mappedBy = "tweet")
    private Collection<Bookmark> bookmarks;

    public Tweet(Utilisateur author, String textualContent,
                 byte[] mediaContent, LocalDateTime createdat,
                 Collection<Utilisateur> usersMentioned) {
        this.author = author;
        this.textualContent = textualContent;
        this.mediaContent = mediaContent;
        this.createdat = createdat;
        this.usersMentioned = usersMentioned;
    }
}
