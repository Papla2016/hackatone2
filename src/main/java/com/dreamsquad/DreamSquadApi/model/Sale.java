package com.dreamsquad.DreamSquadApi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sales")
@Getter @Setter @NoArgsConstructor
public class Sale {
    private @Id @GeneratedValue Long id;

    private String name;
    private String price;
    private String oldPrice;
    private String currency;
    private int category;
    private String imgSource;
    private String description;
    private String brand;
    private Long article;
    private int rating;
    private Long numberOfReviews;
    private double discount;
    private Long UUID;
    private Long extID;
    private String type;
    private String model;

    public Sale() {}

}
