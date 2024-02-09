package com.project.locker.filter;

import com.project.locker.entity.UserEntity;

import java.util.List;

public interface UserFilter {
    List<UserEntity> allowUser(List<UserEntity> userEntities);
}
