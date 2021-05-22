package com.example.trieucaochinh.model;

public class BaseReponse<T> {
    public int status = 1;
    public String message = "success";
    public T data;
}
