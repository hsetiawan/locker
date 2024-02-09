package com.project.locker.entity;


import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "locker_order")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LockerOrderEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "locker_box_id")
    private LockerBoxEntity lockerBox;

    private LocalDateTime orderTime;
    private LocalDateTime pickupTime;
    private boolean pickedUp;
}
