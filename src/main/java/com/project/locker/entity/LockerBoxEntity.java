package com.project.locker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "locker_box")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LockerBoxEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;

    private String name;

    private boolean isAvailable = true;
}
