package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Album")
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "album_ID")
	private long id;

	@ManyToOne
	@JoinColumn(name = "artist_ID")
	private Artist artist;

	@ManyToOne
	@JoinColumn(name = "record_label_ID")
	private RecordLabel recordLabel;

	@Column(name = "album_name")
	private String name;

	@Column(name = "album_type")
	private String type;

	@Column(name = "album_released")
	private LocalDate released;

	@Column(name = "album_recorded")
	private LocalDate recorded;

	@OneToMany(mappedBy = "album")
	private List<AlbumTrack> albumTracks;
}
