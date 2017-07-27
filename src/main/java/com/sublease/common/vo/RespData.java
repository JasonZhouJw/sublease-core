package com.sublease.common.vo;

import com.sublease.common.enums.MessageType;
import com.sublease.common.enums.RespType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jzhou237 on 2017-06-30.
 */
@Getter
@Setter
@ToString
public class RespData<T> {

    private String result;

    private List<Message> messages = new ArrayList<>();

    private T data;

    public RespData() {
        result = RespType.SUCCESS.getCode();
        this.addMessage(RespType.SUCCESS.getMessage());
    }

    private void addMessage(Message message) {
        if (message != null && message.isNotEmpty()) {
            this.messages.add(message);
        }
    }

    public void info(String message) {
        this.addMessage(MessageType.INFO.getMessage(message));
    }

    public void warning(String message) {
        this.addMessage(MessageType.WARNING.getMessage(message));
    }

    public void warning(RespType respType) {
        warning(respType, respType.getLabel());
    }

    public void warning(RespType respType, String message) {
        updateStatus(respType.getCode());
        this.addMessage(respType.getMessage(MessageType.WARNING, message));
    }

    public void danger(String message) {
        this.addMessage(MessageType.DANGER.getMessage(message));
    }

    public void danger(RespType respType) {
        danger(respType, respType.getLabel());
    }

    public void danger(RespType respType, String message) {
        updateStatus(respType.getCode());
        this.addMessage(respType.getMessage(MessageType.DANGER, message));
    }

    private void updateStatus(String code) {
        if (StringUtils.isNotEmpty(code) && !result.equals(code)) {
            this.result = code;
            this.messages = new ArrayList<>();
        }
    }
}
