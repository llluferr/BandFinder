package com.bandfinder.bandfinder.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_ID")
    private Long trackID;
    @Column(name = "track_name")
    private String trackName;
    @Column(name = "track_songwriters")
    private String trackSongwriters;
    @Column(name = "track_released")
    private LocalDate trackReleased;

    @OneToMany(mappedBy = "track", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AlbumTrack> albumTracks;

    @OneToMany(mappedBy = "track", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TrackBand> trackArtists;

    @OneToMany(mappedBy = "track", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GenreTrack> genreTracks;
}
