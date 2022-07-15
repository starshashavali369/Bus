package com.org.cognazant.controller;

import com.org.cognazant.model.ModelClass;
import com.org.cognazant.sevice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/create")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @PostMapping("/create")
    public void createTeacher(@RequestBody ModelClass modelClass) {
        teacherService.createTeacher(modelClass);
    }

    @PutMapping("/update")
    public void updateTeacher(@RequestBody ModelClass modelClass) {
        teacherService.updateTeacher(modelClass);
    }
@GetMapping("/deleteById/{id}")
    public  String deleteById(@PathVariable Integer id){
String ss=teacherService.deleteById(id);
return ss;

}
@PatchMapping("/updateAddressBasedOnParticularId/{id}/{address}")
    public  String updateAddressBasedOnParticularId(@PathVariable Integer id,@PathVariable String address){
   String bb=teacherService.updateAddressBasedOnParticularId(id,address);
        return bb;
}
@GetMapping("/getAll")
    public List<ModelClass>getAll(){
        List<ModelClass>ss=teacherService.getAll();
        return ss;
}
@GetMapping("/getById/{id}")
    public Optional<ModelClass>getById(@PathVariable Integer id){
        Optional<ModelClass>gg=teacherService.getById(id);

        return gg;
}

}
