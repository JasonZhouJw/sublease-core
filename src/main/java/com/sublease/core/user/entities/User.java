package com.sublease.core.user.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jzhou237 on 2017-05-02.
 */
@Setter
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column(length = 11)
    private String phone;

    @Column(length = 200)
    private String password;

    @Column
    private boolean active = true;

    @ManyToMany(targetEntity = Permission.class, cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private List<Permission> permissions = new ArrayList<>();

}
