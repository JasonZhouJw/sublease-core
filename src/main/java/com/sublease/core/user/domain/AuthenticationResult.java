package com.sublease.core.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by jzhou237 on 2016-12-06.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResult {

    private String error;

    private String logout;

    public String getMessage() {
        if (StringUtils.isNotEmpty(error)) {
            return error;
        } else if (StringUtils.isNotEmpty(logout)) {
            return logout;
        }
        return null;
    }

    public AuthenticationResult error(Runnable runnable) {
        if (StringUtils.isNotEmpty(error)) {
            runnable.run();
        }
        return this;
    }

    public AuthenticationResult logout(Runnable runnable) {
        if (StringUtils.isNotEmpty(logout)) {
            runnable.run();
        }
        return this;
    }
}
