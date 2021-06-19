package com.example.trieucaochinh3.sevice;



import com.example.trieucaochinh3.entity.BookEntity;

import java.util.List;

public interface BookSevice {
    List<BookEntity> getAll();
    BookEntity createUser(BookEntity p);
}
