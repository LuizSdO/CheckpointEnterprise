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
@Table(name = "AlbumTrack")
public class AlbumTrack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "albumtrack_ID")
	private long id;

	@ManyToOne
	@JoinColumn(name = "album_ID")
	private Album album;

	@ManyToOne
	@JoinColumn(name = "track_ID")
	private Track track;
}