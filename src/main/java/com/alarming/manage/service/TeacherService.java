package com.alarming.manage.service;

import com.alarming.manage.objectdata.Department;
import com.alarming.manage.objectdata.Teacher;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author GUO
 * @Classname TeacherService
 * @Description TODO
 * @Date 2021/4/8 18:05
 */
public interface TeacherService {
    List<Teacher>findAll();
    Teacher findByUserAndPassword(String user, String password);
    boolean saveTeacher(Teacher teacher, Integer departmentId,Integer classId);
    boolean delTeacher(Integer id);
    Teacher findByUser(String user);
    void updateTeacher(String password,String username,String sex,String phone,String email,Integer id);
}
