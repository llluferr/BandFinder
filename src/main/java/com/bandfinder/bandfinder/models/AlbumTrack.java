package com.bandfinder.bandfinder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "ALBUM TRACK")
public class AlbumTrack {

    @Id
    @ManyToOne
    @JoinColumn(name = "album_ID")
    private Album album;

    @Id
    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track track;

}
