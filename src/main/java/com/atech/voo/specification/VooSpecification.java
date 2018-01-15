package com.atech.voo.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.atech.voo.model.Voo;
import com.atech.voo.specification.search.VooSearch;

/**
 * Created by alessandra on 2018/01/14.
 */
public class VooSpecification implements Specification<Voo> {

    private VooSearch criteria;

    public VooSpecification(VooSearch vooSearch){
        this.criteria = vooSearch;
    }

    @Override
    public Predicate toPredicate(Root<Voo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {

        Path cidadeOrigem = root.get("cidadeOrigem").get("nome");
        Path cidadeDestino = root.get("cidadeDestino").get("nome");
        Path status = root.get("status").get("nome");

        final List<Predicate> predicates = new ArrayList<Predicate>();

        if(criteria.getCidadeOrigem() != null){
            predicates.add(cb.like(cb.lower(cidadeOrigem), "%"+criteria.getCidadeOrigem().toLowerCase()+"%"));
        }

        if(criteria.getCidadeDestino() != null){
            predicates.add(cb.like(cb.lower(cidadeDestino), "%"+criteria.getCidadeDestino().toLowerCase()+"%"));
        }

        if(criteria.getStatus() != null) {
            predicates.add(cb.like(cb.lower(status), "%"+criteria.getStatus().toLowerCase()+"%"));
        }

        return cb.and(predicates.toArray(new Predicate[predicates.size()]));
    }
}
