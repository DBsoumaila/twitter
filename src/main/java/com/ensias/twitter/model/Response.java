package com.ensias.twitter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String textualContent;

    @Lob
    private byte[] mediaContent;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "tweetid"
    )
    private Tweet tweet;

    public Response(String textualContent, byte[] mediaContent, Tweet tweet) {
        this.textualContent = textualContent;
        this.mediaContent = mediaContent;
        this.tweet = tweet;
    }
}
