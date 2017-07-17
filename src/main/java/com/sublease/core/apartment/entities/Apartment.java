package com.sublease.core.apartment.entities;

import com.sublease.core.common.entities.City;
import com.sublease.core.common.entities.District;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by jzhou237 on 2017-06-28.
 */
public class Apartment {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "DISTRICT_ID", updatable = false, nullable = false)
    private District district;

    @Column(length = 500)
    private String address1;

    @Column(length = 500)
    private String address2;

    @Column
    private int floor;

    @Column(length = 20)
    private String number;

}
