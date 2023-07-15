package com.pratyush.springbootrestapi.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratyush.springbootrestapi.entity.Course;

@Repository
public interface CourseDao extends JpaRepository<Course,Long> {

}
