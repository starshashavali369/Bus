package com.org.cognazant.sevice;

import com.org.cognazant.model.ModelClass;
import com.org.cognazant.repositary.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepo teacherRepo;
    @Override
    public void createTeacher(ModelClass modelClass) {
        teacherRepo.save(modelClass);
    }
    @Override
    public void updateTeacher(ModelClass modelClass) {
        teacherRepo.save(modelClass);
    }
    @Override
    public String deleteById(Integer id) {
        teacherRepo.deleteById( id);
        return "success";
    }
    @Override
    public String updateAddressBasedOnParticularId(Integer id, String address) {
        Optional<ModelClass> sai=teacherRepo.findById(id);
        ModelClass vali  =sai.get();
        vali.setAddress(address);
        return "valli";
    }
    @Override
    public List<ModelClass> getAll() {
        List<ModelClass> ss = teacherRepo.findAll();
        return ss;
    }
    @Override
    public Optional<ModelClass> getById(Integer id) {
        Optional<ModelClass> gg = teacherRepo.findById(id);
        return gg;
    }


}



