package dao;

import java.sql.Connection;
import java.util.List;


import entity.Student;

public interface BaseDao {
	Connection getconn();
	List<Student> getSlist();
	List<Student> AddS();
	int DelS();
	int update();
}
