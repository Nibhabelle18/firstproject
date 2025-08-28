package org.sony.project.firstproject.dao;

import org.sony.project.firstproject.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<StudentEntity,Integer> {
}
