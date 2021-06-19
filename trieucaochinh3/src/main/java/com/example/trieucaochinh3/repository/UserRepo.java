package com.example.trieucaochinh3.repository;


import com.example.trieucaochinh3.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<BookEntity, Integer> {
}
