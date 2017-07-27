package com.sublease.core.user.domain;

import com.sublease.common.vo.Paging;
import com.sublease.common.vo.PagingData;
import com.sublease.core.user.entities.User;

/**
 * Created by jzhou237 on 2017-07-27.
 */
public interface IUser {

    PagingData<User> userPaging(Paging paging, User user);
}
