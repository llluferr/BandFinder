package com.bandfinder.bandfinder.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "RECORD LABEL")
public class RecordLabel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_label_id")
    private Long recordLabelID;
    @Column(name = "record_label_name")
    private String recordLabelName;
    private String website;

    @OneToMany(mappedBy = "recordLabel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Album> albums;

}
