package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);//Responsável em  no banco de dados o obj
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);//Consultar obj pelo id
	List<Department> findAll();
}
