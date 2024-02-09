package com.project.locker.service;


import com.project.locker.dto.request.LockerBoxDto;
import com.project.locker.entity.LockerBoxEntity;

import java.util.List;

public interface LockerBoxService {
    List<LockerBoxEntity> getAll();

    Boolean create(LockerBoxDto lockerBoxDto) throws Exception;

    Boolean update(Long id, LockerBoxDto lockerBoxDto) throws Exception;
}
