package com.atech.voo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.atech.voo.model.Voo;

/**
 * Created by alessandra on 2018/01/14.
 */
@Repository
public interface VooRepository extends JpaRepository<Voo, Long>, JpaSpecificationExecutor<Voo> {
}
