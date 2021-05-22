package com.example.trieucaochinh.sevice;

import com.example.trieucaochinh.entity.StaffEntity;
import com.example.trieucaochinh.repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffSevicemlpl implements StaffSevice{

    @Autowired
    StaffRepo staffRepo;
    @Override
    public List<StaffEntity> getAll() {
        return staffRepo.findAll();
    }

    @Override
    public StaffEntity createStaff(StaffEntity p) {
        return staffRepo.save(p);
    }



}
