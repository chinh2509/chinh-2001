package com.example.trieucaochinh.repository;

import com.example.trieucaochinh.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StaffRepo extends JpaRepository<StaffEntity, Integer> {

}
