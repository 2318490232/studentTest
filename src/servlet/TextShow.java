package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import entity.Student;
import jdk.nashorn.internal.runtime.JSONFunctions;
import service.Sservice;
import service.impl.Sserviceimpl;
@WebServlet("/Show")
public class TextShow extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/json;charset=UTF-8");  
		resp.setCharacterEncoding("UTF-8");
		Sservice s=new Sserviceimpl();
		PrintWriter out = resp.getWriter();
		List<Student> stu=s.getstudent();
		String st=JSON.toJSONString(stu);
		System.out.println(st);
		System.out.println("666666666");
		out.println(st);
		out.flush();
		out.close();
		
	}
	
}
