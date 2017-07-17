package com.sublease.edge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jzhou237 on 2017-05-02.
 */
@Repository
public interface UserLogRepository extends JpaRepository<UserLog, Long> {
}
