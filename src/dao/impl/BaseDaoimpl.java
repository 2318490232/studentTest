package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.javassist.bytecode.stackmap.TypeData.ClassName;


import dao.BaseDao;
import entity.Student;

public class BaseDaoimpl implements BaseDao {

	@Override
	public Connection getconn() {
		Connection conn=null;
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student?characterEncoding=UTF-8","root", "1234");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return conn;
	}

	@Override
	public List<Student> getSlist() {
		List<Student> slist=new ArrayList<Student>();
		// TODO Auto-generated method stub
		String sql="select * from student";
		ResultSet rs=null;
		PreparedStatement pr=null;
		try {
			pr=getconn().prepareStatement(sql);
			rs=pr.executeQuery();
			while(rs.next()) {
				slist.add(new Student(rs.getString(1), rs.getString(2), rs.getInt(3),rs.getInt(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slist;
	}

	@Override
	public List<Student> AddS() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int DelS() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

}
