package cn.fym.ssh.dao;

import cn.fym.ssh.domain.Department;

import java.util.List;

/**
 * 部门管理的DAO层的接口
 */
public interface DepartmentDao {
    int findCount();

    List<Department> findByPage(int begin, int pageSize);

    void save(Department department);

    Department findById(Integer did);

    void update(Department department);

    void delete(Department department);

    List<Department> findAll();
}
