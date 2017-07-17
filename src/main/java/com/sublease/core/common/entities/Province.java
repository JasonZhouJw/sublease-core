package com.sublease.core.common.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by jzhou237 on 2017-06-28.
 */
@Table
public class Province {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 200)
    private String name;
}
