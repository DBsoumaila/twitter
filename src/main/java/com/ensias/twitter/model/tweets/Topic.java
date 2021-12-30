package com.ensias.twitter.model.tweets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="topiclabel")
    private String topiclabel;

    @OneToMany(mappedBy = "topic")
    private Collection<Tweet> tweets;

    public Topic(String topiclabel) {
        this.topiclabel = topiclabel;
    }
}
