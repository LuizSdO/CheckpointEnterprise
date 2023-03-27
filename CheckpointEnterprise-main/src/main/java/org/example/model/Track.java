package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Track")
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_ID")
    private long id;

    @Column(name = "track_name")
    private String name;

    @Column(name = "track_length")
    private LocalTime length;

    @Column(name = "track_size")
    private long size;

    @Column(name = "track_price")
    private double price;

    @Column(name = "track_language")
    private String language;

    @Column(name = "track_producer")
    private String producer;

    @Column(name = "track_songwriters")
    private String songwriters;

    @Column(name = "track_released")
    private LocalDate released;

    @ManyToOne
    @JoinColumn(name = "artist_ID")
    private Artist artist;

    @OneToMany(mappedBy = "track")
    private List<AlbumTrack> albumTracks;

    @ManyToOne
    @JoinColumn(name = "featuring_artist_ID")
    private Artist featuringArtist;

    @OneToMany(mappedBy = "track")
    private List<GenreTrack> genreTracks;

    @OneToMany(mappedBy = "track")
    private List<Purchase> purchases;
}