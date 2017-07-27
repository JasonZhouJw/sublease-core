package com.sublease.common.vo;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by jzhou237 on 2017-07-27.
 */
@Setter
@Getter
public class Message {

    private String messageType;

    private String message;

    public Message() {

    }

    public Message(String messageTypes, String message) {
        this.message = message;
        this.messageType = messageTypes;
    }

    public boolean isNotEmpty() {
        boolean empty = true;
        if (StringUtils.isEmpty(this.message)) {
            empty = false;
        }
        return empty;
    }
}
