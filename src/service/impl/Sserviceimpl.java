package service.impl;

import java.util.List;

import dao.BaseDao;
import dao.impl.BaseDaoimpl;
import entity.Student;
import service.Sservice;

public class Sserviceimpl implements Sservice {

	@Override
	public List<Student> getstudent() {
		// TODO Auto-generated method stub
		BaseDao dao=new BaseDaoimpl();
		return dao.getSlist();
	}

}
