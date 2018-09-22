package com.codihub.codipetclinic.services.map;

import com.codihub.codipetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    //Because we are using generics, we do not know what type of object we are using so we just use object of type T
    T save(T object) {

        if(object != null) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {

        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException ex){
            nextId = 1L;
        }

        return nextId; //To make this work, we will: i. make ID extend Long and then ii. in the map variable, change the ID to Long
    }
}
