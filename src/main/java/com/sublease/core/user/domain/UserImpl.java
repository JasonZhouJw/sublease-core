package com.sublease.core.user.domain;

import com.sublease.common.vo.Paging;
import com.sublease.common.vo.PagingData;
import com.sublease.core.user.entities.User;
import com.sublease.core.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

/**
 * Created by jzhou237 on 2017-07-27.
 */
@Component
public class UserImpl implements IUser {

    @Autowired
    private UserRepository userRepository;

    @Value("${perPageSize}")
    private int size;

    @Override
    public PagingData<User> userPaging(Paging paging, User user) {
        Page<User> page = userRepository.findAll(new PageRequest(paging.getPage(), size));
        return PagingData.getPagingData(page);
    }
}
