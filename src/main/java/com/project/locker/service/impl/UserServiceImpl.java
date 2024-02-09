package com.project.locker.service.impl;

import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import com.project.locker.dto.request.UserRequestDto;
import com.project.locker.entity.UserEntity;
import com.project.locker.exception.APIException;
import com.project.locker.repo.UserRepo;
import com.project.locker.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private static final ModelMapper mapper = new ModelMapper();

    @Autowired
    UserRepo userRepo;

    @Override
    public List<UserEntity> getAll() {
        return userRepo.findAll();
    }

    @Override
    public Boolean create(UserRequestDto userRequestDto) throws Exception {

        UserEntity user = mapper.map(userRequestDto, UserEntity.class);
        userRepo.save(user);

        return true;
    }

    @Override
    public Boolean update(Long id, UserRequestDto userRequestDto) throws Exception {
        UserEntity user = userRepo.getById(id);
        if(user.getId() == null)
            throw new APIException("Data not found");

        user.setUsername(userRequestDto.getUsername());
        user.setFullName(userRequestDto.getFullName());
        user.setEmail(userRequestDto.getEmail());
        userRepo.save(user);

        return true;
    }

    @Override
    public Boolean delete(Long id) throws Exception {
        UserEntity user = userRepo.getById(id);
        log.info("{}", user);

        if(user.getId() == null)
            throw new APIException("Data not found");

        userRepo.delete(user);
        return true;
    }
}
