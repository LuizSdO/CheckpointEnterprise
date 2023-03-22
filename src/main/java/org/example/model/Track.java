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
@Table(name = "Track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_ID")
    private long id;
    @Column(name = "track_name")
    private String name;
    @Column(name = "track_length")
    private int length;
    @Column(name = "track_size")
    private int size;
    @Column(name = "track_price")
    private double price;
    @Column(name = "track_language")
    private String language;
    @Column(name = "track_producer")
    private String produces;
    @Column(name = "track_songwriters")
    private String writes;
    @Column(name = "track_released")
    private boolean released;
}
