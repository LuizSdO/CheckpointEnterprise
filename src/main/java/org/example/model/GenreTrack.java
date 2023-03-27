package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GenreTrack")
public class GenreTrack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genretrack_ID")
    private long id;

    @ManyToOne
    @JoinColumn(name = "genre_ID")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track track;
}