package com.bandfinder.bandfinder.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "TRACK BAND")
public class TrackBand {

    @Id
    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track track;
    @Id
    @ManyToOne
    @JoinColumn(name = "band_ID")
    private Band band;
    @Id
    @ManyToOne
    @JoinColumn(name = "featuring_artist_ID")
    private Band featuringArtist;

}
