package com.dreamsquad.DreamSquadApi.model;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@XmlRootElement(name = "yml_catalog")
@XmlAccessorType(XmlAccessType.FIELD)
@Setter
@Getter
public class YmlCatalog {

    @XmlAttribute(name = "date")
    private String date;

    @XmlElement(name = "shop")
    private Shop shop;

}
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
class Shop {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "company")
    private String company;

    @XmlElement(name = "url")
    private String url;

    @XmlElementWrapper(name = "offers")
    @XmlElement(name = "offer")
    private List<Offer> offers;
}
@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
class Offer {

    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "available")
    private boolean available;

    @XmlElement(name = "price")
    private double price;

    @XmlElement(name = "currencyId")
    private String currencyId;

    @XmlElement(name = "categoryId")
    private int categoryId;

    @XmlElement(name = "picture")
    private String picture;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "vendor")
    private String vendor;

    @XmlElement(name = "description")
    private String description;

    @XmlElement(name = "barcode")
    private String barcode;

    @XmlElement(name = "param")
    private List<Param> params;
}
@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
class Param {

    @XmlAttribute(name = "name")
    private String name;

    @XmlValue
    private String value;

}
