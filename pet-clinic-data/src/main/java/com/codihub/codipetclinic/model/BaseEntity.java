package com.codihub.codipetclinic.model;

import java.io.Serializable;

/*
 * This class is to provide all the other POJO classes with an id value. So instead of adding the id value in each POJO class,
 * we just create one class with the id variable and all the POJO will extend this base entity class
 */
public class BaseEntity implements Serializable {

    //JPA recommends to user wrapper classes than primitives because for instance, you may have a null object
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
