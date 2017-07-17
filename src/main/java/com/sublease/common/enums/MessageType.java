package com.sublease.common.enums;

import lombok.Getter;

/**
 * Created by jzhou237 on 2017-06-30.
 */
@Getter
public enum MessageType {
    INFO("info"), DANGER("danger"), FAIL("fail");

    private String code;

    MessageType(String code) {
        this.code = code;
    }
}
