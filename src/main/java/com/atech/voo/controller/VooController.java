package com.atech.voo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atech.voo.model.Voo;
import com.atech.voo.service.VooService;
import com.atech.voo.specification.search.VooSearch;
import com.atech.voo.specification.VooSpecification;


/**
 * Created by alessandra on 2018/01/14.
 */
@RestController
@RequestMapping("/api/voos")
public class VooController {
	
    private final VooService vooService;

    @Autowired
    public VooController(VooService vooService){
        this.vooService = vooService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Page<Voo> index(VooSearch search,
                               Pageable pageable) {

        VooSpecification specification = new VooSpecification(search);

        return vooService.findAll(specification, pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Voo show(@PathVariable Long id) {
        Voo voo = vooService.findById(id);
        return voo;
    }
}
