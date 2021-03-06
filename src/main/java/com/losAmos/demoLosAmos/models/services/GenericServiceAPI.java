package com.losAmos.demoLosAmos.models.services;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceAPI <T, ID extends Serializable> {

    T       save (T entity);
    void    delete (ID id);
    T       getOne(ID id);
    List<T> getAll();

}
