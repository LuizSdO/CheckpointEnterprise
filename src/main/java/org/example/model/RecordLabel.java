package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RecordLabel")
public class RecordLabel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_label_ID")
    private long id;

    @Column(name = "record_label_name")
    private String name;

    private String website;

    @OneToMany(mappedBy = "recordLabel")
    private List<Album> albums;
}