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
@Entity(name = "GENRE TRACK")
public class GenreTrack {
    @Id
    @ManyToOne
    @JoinColumn(name = "genre_ID")
    private Genre genre;
    @Id
    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track track;
}