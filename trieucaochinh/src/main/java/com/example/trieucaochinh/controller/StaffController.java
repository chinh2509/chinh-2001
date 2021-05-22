package com.example.trieucaochinh.controller;

import com.example.trieucaochinh.entity.StaffEntity;
import com.example.trieucaochinh.model.BaseReponse;
import com.example.trieucaochinh.repository.StaffRepo;
import com.example.trieucaochinh.sevice.StaffSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    @Autowired
    StaffSevice staffSevice;

    @GetMapping
    public ResponseEntity getProduct(@RequestParam(value = "name", required = false) String name) {
        BaseReponse res = new BaseReponse();
        if (name != null){
            res.data = staffSevice.getAll();
        }else {
            res.data = staffSevice.getAll();
        }
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createProduct(@RequestBody StaffEntity p){
        StaffEntity data = staffSevice.createStaff(p);
        BaseReponse res = new BaseReponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }



}
