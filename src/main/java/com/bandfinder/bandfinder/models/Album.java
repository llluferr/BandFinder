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
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_ID")
    private Long album_id;

    @ManyToOne
    @JoinColumn(name = "artist_ID")
    private Band band;

    @ManyToOne
    @JoinColumn(name = "record_label_ID")
    private RecordLabel recordLabel;
    @Column(name = "album_name")
    private String albumName;
    @Column(name = "album_type")
    private String albumType;
    @Column(name = "album_released")
    private LocalDate albumReleased;
    @Column(name = "album_recorded")
    private LocalDate albumRecorded;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AlbumTrack> albumTracks;

}
