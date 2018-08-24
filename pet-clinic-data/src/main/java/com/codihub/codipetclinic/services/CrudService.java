package com.codihub.codipetclinic.services;

import java.util.Set;

//We want to mimick some methods in the default CRUDRepository
public interface CrudService <T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
