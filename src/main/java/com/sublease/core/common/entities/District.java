package com.sublease.core.common.entities;

import javax.persistence.*;

/**
 * Created by jzhou237 on 2017-06-28.
 */
@Table
public class District {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "CITY_ID", nullable = false, updatable = false)
    private City city;
}
