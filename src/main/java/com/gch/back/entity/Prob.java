package com.gch.back.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROB_TB")
@Getter
@NoArgsConstructor
public class Prob extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "PROB_ID")
    private Integer probId;

    @Column(name = "PROB_TIT")
    private String probTit;

    @OneToMany(mappedBy = "prob")
    private List<Lan> lanProbs = new ArrayList<Lan>();

}