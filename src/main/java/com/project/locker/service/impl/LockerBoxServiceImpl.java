package com.project.locker.service.impl;

import com.project.locker.dto.request.LockerBoxDto;
import com.project.locker.entity.LockerBoxEntity;
import com.project.locker.exception.APIException;
import com.project.locker.repo.LockerBoxRepo;
import com.project.locker.service.LockerBoxService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LockerBoxServiceImpl implements LockerBoxService {
    private static final ModelMapper mapper = new ModelMapper();

    @Autowired
    LockerBoxRepo lockerBoxRepo;

    @Override
    public List<LockerBoxEntity> getAll() {
        return lockerBoxRepo.findAll();
    }

    @Override
    public Boolean create(LockerBoxDto lockerBoxDto) throws Exception {
        LockerBoxEntity lockerBox = mapper.map(lockerBoxDto, LockerBoxEntity.class);

        lockerBoxRepo.save(lockerBox);
        return true;
    }


    @Override
    public Boolean update(Long id, LockerBoxDto lockerBoxDto) throws Exception {
        Optional<LockerBoxEntity> lockerBox = lockerBoxRepo.findById(id);
        if(!lockerBox.isPresent())
            throw new APIException("Data is not found");

        LockerBoxEntity lockerBoxDb = lockerBox.get();
        lockerBoxDb.setLocation(lockerBoxDto.getLocation());
        lockerBoxDb.setName(lockerBoxDb.getName());
        lockerBoxRepo.save(lockerBoxDb);

        return true;
    }
}
