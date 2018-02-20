package cn.fym.ssh.service;

import cn.fym.ssh.domain.Department;
import cn.fym.ssh.domain.PageBean;

import java.util.List;

/**
 * 部门管理的业务层的接口
 */
public interface DepartmentService {
    PageBean<Department> findByPage(Integer currPage);

    void save(Department department);

    Department findById(Integer did);

    void update(Department department);

    void delete(Department department);

    List<Department> findAll();
}
