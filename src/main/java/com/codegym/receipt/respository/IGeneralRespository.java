package com.codegym.receipt.respository;

import java.util.List;

public interface IGeneralRespository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
