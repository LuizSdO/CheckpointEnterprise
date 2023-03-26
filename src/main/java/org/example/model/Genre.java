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

@Table(name = "Genre")
public class Genre {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_ID")
    private long id;

    @Column(name = "genre_name")
    private String name;
}

