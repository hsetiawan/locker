package com.project.locker.repo;

import com.project.locker.entity.LockerOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerOrderRepo extends JpaRepository<LockerOrderEntity, Long> {
}
