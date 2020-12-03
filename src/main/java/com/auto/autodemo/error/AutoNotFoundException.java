package com.auto.autodemo.error;

public class AutoNotFoundException extends RuntimeException {
    public AutoNotFoundException(long id){
        super("Автомобиль не найден: " + id);
    }
}
