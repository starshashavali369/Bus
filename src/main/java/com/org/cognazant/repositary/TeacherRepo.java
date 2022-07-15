package com.org.cognazant.repositary;

import com.org.cognazant.model.ModelClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<ModelClass,Integer> {
}
