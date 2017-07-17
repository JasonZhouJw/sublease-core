package com.sublease.edge;

import lombok.Getter;

/**
 * Created by jzhou237 on 2017-05-02.
 */
public enum ActionType {

    EDIT("EDIT");

    @Getter
    private String type;

    private ActionType(String type) {
        this.type = type;
    }
}
