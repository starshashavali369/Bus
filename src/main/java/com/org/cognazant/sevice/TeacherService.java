package com.org.cognazant.sevice;

import com.org.cognazant.model.ModelClass;
import com.org.cognazant.repositary.TeacherRepo;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


public interface TeacherService {
    public void createTeacher(ModelClass modelClass);

    public void updateTeacher(ModelClass modelClass);
    public  String deleteById(Integer id);
    public  String updateAddressBasedOnParticularId( Integer id, String address);
    public List<ModelClass>getAll();
    public Optional<ModelClass> getById( Integer id);
    }


