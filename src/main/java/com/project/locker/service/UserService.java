package com.project.locker.service;

import com.project.locker.dto.request.UserRequestDto;
import com.project.locker.entity.UserEntity;
import com.project.locker.exception.APIException;

import java.util.List;

public interface UserService {
    List<UserEntity> getAll();
    Boolean create(UserRequestDto userRequestDto) throws Exception;
    Boolean update(Long id, UserRequestDto userRequestDto) throws Exception;

    Boolean delete(Long id) throws Exception;
}
