package com.sublease.common.enums;

import com.sublease.common.vo.Message;
import lombok.Getter;

/**
 * Created by jzhou237 on 2017-06-30.
 */
@Getter
public enum MessageType {
    INFO("info"),
    DANGER("danger"),
    SUCCESS("success"),
    ACTIVE("active"),
    WARNING("warning");

    private String code;

    MessageType(String code) {
        this.code = code;
    }

    public Message getMessage(String message) {
        return new Message(this.code, message);
    }

}
