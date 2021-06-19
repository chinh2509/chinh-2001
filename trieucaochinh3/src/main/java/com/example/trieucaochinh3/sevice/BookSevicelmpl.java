package com.example.trieucaochinh3.sevice;

import com.example.trieucaochinh3.entity.BookEntity;
import com.example.trieucaochinh3.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookSevicelmpl implements BookSevice {

    @Autowired
    UserRepo userRepo;
    @Override
    public List<BookEntity> getAll() {
        return userRepo.findAll();
    }

    @Override
    public BookEntity createUser(BookEntity p) {
        return userRepo.save(p);
    }
}
