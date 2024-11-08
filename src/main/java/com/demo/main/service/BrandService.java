package com.demo.main.service;

import com.demo.main.entity.Brand;
import jakarta.persistence.metamodel.IdentifiableType;

public interface BrandService {

    Brand getById(Long id);

}
