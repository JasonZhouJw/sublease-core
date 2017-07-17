package com.sublease.edge;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by jzhou237 on 2017-05-02.
 */
@Getter
@Setter
@Entity
public class UserLog {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private ActionType actionType;

    public UserLog() {

    }

    public UserLog(String name, ActionType actionType) {
        this.name = name;
        this.actionType = actionType;
    }
}
