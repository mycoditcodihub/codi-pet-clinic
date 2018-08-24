package com.codihub.codipetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    //JPA recommends to user wrapper classes than primitives because for instance, you have have a null object
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
