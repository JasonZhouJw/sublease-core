package com.sublease.core.common.entities;

import javax.persistence.*;

/**
 * Created by jzhou237 on 2017-06-28.
 */
@Table
public class City {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 50)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name="PROVINCE_ID", nullable=false, updatable=false)
    private Province province;
}
