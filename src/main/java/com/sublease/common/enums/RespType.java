package com.sublease.common.enums;

import com.sublease.common.vo.Message;
import lombok.Getter;

/**
 * Created by jzhou237 on 2017-07-27.
 */
@Getter
public enum RespType {
    SUCCESS("000000", "label.success", MessageType.SUCCESS);

    private String code;

    private String label;

    private MessageType messageType;

    private RespType(String code, String label) {
        this.code = code;
        this.label = label;
    }

    private RespType(String code, String label, MessageType messageType) {
        this.code = code;
        this.label = label;
        this.messageType = messageType;
    }

    public Message getMessage(MessageType messageType, String message) {
        if (messageType != null) {
            return messageType.getMessage(message);
        }
        return new Message();
    }

    public Message getMessage() {
        return getMessage(this.messageType, this.label);
    }


}
