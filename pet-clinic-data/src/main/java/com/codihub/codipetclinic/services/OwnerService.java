package com.codihub.codipetclinic.services;

import com.codihub.codipetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
