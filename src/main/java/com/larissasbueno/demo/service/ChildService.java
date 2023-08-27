package com.larissasbueno.demo.service;

import com.larissasbueno.demo.model.Child;
import com.larissasbueno.demo.model.Parent;
import com.larissasbueno.demo.repository.ChildRepository;
import com.larissasbueno.demo.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    private final ChildRepository childRepository;

    @Autowired
    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    // 3. For every CHILD, the name of his/her father and mother, if defined
    public List<Child> findAllChildrenWithParents() {
        return childRepository.findAllChildrenWithParents();
    }

    public List<Parent> findAllDistinctFathers() {
        return childRepository.findAllDistinctFathers();
    }
}
