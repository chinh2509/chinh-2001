package com.example.trieucaochinh.sevice;

import com.example.trieucaochinh.entity.StaffEntity;

import java.util.List;

public interface StaffSevice {
    List<StaffEntity> getAll();
    StaffEntity createStaff(StaffEntity p);



}
