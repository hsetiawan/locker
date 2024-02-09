package com.project.locker.repo;

import com.project.locker.entity.LockerBoxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerBoxRepo extends JpaRepository<LockerBoxEntity, Long> {
}
