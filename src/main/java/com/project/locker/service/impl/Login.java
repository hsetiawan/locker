//this is implementation about filter pattern,
// apa itu filter pattern : adalah sebuah pattern untuk membuat filter pada sekumpulan object dengan berbagai criteria yang di inginkan
// dan merangkainya dengan cara terpisah dengan operasi logical
// filter patern memungkin kan developer untuk memisahkan criteria filter dan proses filter
// dibawah ini contoh ada 2 criteria, ADMIN dan SPV criteria

package com.project.locker.service.impl;

import com.project.locker.entity.UserEntity;
import com.project.locker.filter.AdministratorFilter;
import com.project.locker.filter.SupervisorFilter;
import com.project.locker.filter.UserFilter;

import java.util.ArrayList;
import java.util.List;

public class Login {

    public static void main(String[] args) {
        List<UserEntity> userEntities = new ArrayList<>();

        UserEntity adminLogin = new UserEntity();
        adminLogin.setCreatedBy("ADMIN");
        adminLogin.setFullName("JHON DOE");
        userEntities.add(adminLogin);

        UserEntity spvLogin = new UserEntity();
        spvLogin.setCreatedBy("SPV");
        spvLogin.setFullName("RONALD DOE");

        userEntities.add(spvLogin);

        //chain 1
        System.out.println("ADMIN :");
        UserFilter adminFilter = new AdministratorFilter();
        printLog(adminFilter.allowUser(userEntities));

        //chain 2
        System.out.println("SPV :");
        UserFilter spvFilter = new SupervisorFilter();
        printLog(spvFilter.allowUser(userEntities));



    }

    public static void printLog(List<UserEntity> userEntities){
        userEntities.forEach(userEntity -> System.out.println("username: "+userEntity.getFullName()+" | role :"+userEntity.getCreatedBy()));
    }
}


