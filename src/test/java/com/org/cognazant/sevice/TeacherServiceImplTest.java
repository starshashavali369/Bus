package com.org.cognazant.sevice;

import com.org.cognazant.model.ModelClass;
import com.org.cognazant.repositary.TeacherRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class TeacherServiceImplTest {
    @InjectMocks
  private  TeacherServiceImpl teacherServiceImpl;

    @Mock
    private TeacherRepo teacherRepo;

    @Test
    void testCreateTeacher() {
    ModelClass modelClass=new ModelClass();
      modelClass.setId(100);
      modelClass.setName("sai");
      modelClass.setAddress("blr");
      teacherServiceImpl.createTeacher(modelClass);
      Mockito.verify(teacherRepo,Mockito.times(1)).save(modelClass);

    }

    @Test
    void testUpdateTeacher() {
      ModelClass modelClass=new ModelClass();
      modelClass.setId(100);
      modelClass.setName("rani");
      modelClass.setAddress("blr");
      teacherServiceImpl.updateTeacher(modelClass);
      Mockito.verify(teacherRepo,Mockito.times(1)).save(modelClass);
    }

    @Test
    void deleteById() {
      int id=100;
      String apple1="success";
      String apple=teacherServiceImpl.deleteById(id);
      Mockito.verify(teacherRepo,Mockito.times(1)).deleteById( id);
      Assertions.assertEquals(apple1,apple);
    }
    @Test
    void updateParticularId() {
      int id = 100;
      String address = "blr";
      String value = "valli";
      ModelClass ModelClass = new ModelClass();
      ModelClass.setId(100);
      ModelClass.setAddress("blr");
      Optional<ModelClass> fan = Optional.of(ModelClass);
      Mockito.when(teacherRepo.findById(id)).thenReturn(fan);
      String value1 = teacherServiceImpl.updateAddressBasedOnParticularId(id, address);
      Assertions.assertEquals(value1, value);
    }

    @Test
    void getAll() {
      ModelClass modelClass1=new ModelClass();
      modelClass1.setId(100);
      modelClass1.setAddress("blr");
      ModelClass modelClass2=new ModelClass();

      modelClass2.setId(101);
      modelClass2.setAddress("chennai");

      List<ModelClass> list=new ArrayList<>();
      list.add(modelClass1);
      list.add(modelClass2);

      Mockito.when(teacherRepo.findAll()).thenReturn(list);

      List<ModelClass> list1 =teacherServiceImpl.getAll();


      Assertions.assertEquals(list.size(), list1.size());
    }

    @Test
    void getById() {

      int id=101;
      ModelClass ModelClass = new ModelClass();
      ModelClass.setId(100);
      ModelClass.setAddress("blr");
      Optional<ModelClass> fan = Optional.of(ModelClass);
      Mockito.when(teacherRepo.findById(id)).thenReturn(fan);
      Optional<ModelClass> fan2  =teacherServiceImpl.getById(id);
      Assertions.assertEquals(fan, fan2);
    }
}