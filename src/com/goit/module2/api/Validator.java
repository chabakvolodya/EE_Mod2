package com.goit.module2.api;

/**
 * Created by Администратор on 27.03.2016.
 */
public interface Validator<T> {

    // Валидирует переданое значение
    boolean isValid(T result);

}