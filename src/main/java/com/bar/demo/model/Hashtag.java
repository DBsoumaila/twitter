package com.bar.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Hashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="topiclabel")
    private String hashtaglabel;

    @OneToMany(mappedBy = "hashtag")
    private Collection<Tweet> tweets;

    public Hashtag(String hashtaglabel) {
        this.hashtaglabel = hashtaglabel;
    }
}
