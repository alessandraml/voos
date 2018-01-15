package com.atech.voo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.atech.voo.model.Voo;
import com.atech.voo.specification.VooSpecification;

/**
 * Created by alessandra on 2018/01/14.
 */
public interface VooService {

    Page<Voo> findAll(VooSpecification specification, Pageable pageable);

    Voo findById(Long id);
}
