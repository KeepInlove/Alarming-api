package com.alarming.manage.service;

import com.alarming.manage.objectdata.Department;
import com.alarming.manage.objectdata.SClass;
import com.alarming.manage.vo.ClassVO;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * @author GUO
 * @Classname SClass
 * @Description TODO
 * @Date 2021/4/14 17:56
 */
public interface SClassService {
    List<SClass> findAll();
    List<SClass>findByDepartment(Integer departmentId);
    List<SClass>findByDepartmentId(Integer departmentId);
    List<ClassVO>findClassVO();
    List<ClassVO>findByDepartmentIdOrMajorId(Integer departmentId ,Integer majorId);
    boolean saveClass(Integer departmentId,Integer majorId,String name);

}
