package com.ensias.twitter.model.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="content")
    private String content;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "userid"
    )
    private Utilisateur user;

    public Search(String content, Utilisateur user) {
        this.content = content;
        this.user = user;
    }
}
