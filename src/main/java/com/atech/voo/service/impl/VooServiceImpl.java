package com.atech.voo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atech.voo.model.Voo;
import com.atech.voo.repository.VooRepository;
import com.atech.voo.service.VooService;
import com.atech.voo.specification.VooSpecification;

/**
 * Created by alessandra on 2018/01/14.
 */
@Service
@Transactional
public class VooServiceImpl implements VooService {

    private final VooRepository repository;

    @Autowired
    public VooServiceImpl(VooRepository repository) {
        this.repository = repository;
    }

    @Override
    public  Page<Voo> findAll(VooSpecification specification, Pageable pageable){ return this.repository.findAll(specification, pageable);}

    @Override
    public Voo findById(Long id) {
        return this.repository.findOne(id);
    }
}
