package com.project.locker.filter;

import com.project.locker.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorFilter implements UserFilter{
    @Override
    public List<UserEntity> allowUser(List<UserEntity> userEntities) {
        return userEntities.stream().filter(userEntity -> userEntity.getCreatedBy().equals("ADMIN")).toList();
    }



}
