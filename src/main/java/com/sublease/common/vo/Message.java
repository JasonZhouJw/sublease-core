package com.sublease.common.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by jzhou237 on 2017-06-30.
 */
@Getter
@Setter
@ToString
public class Message<T> {

    private String code;

    private String message;

    private T data;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }
}
