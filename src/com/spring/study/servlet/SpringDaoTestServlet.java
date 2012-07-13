package com.spring.study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.study.bean.UserInfo;
import com.spring.study.dao.test.SpringDaoTest;

/**
 * Servlet implementation class SpringDaoTestServlet
 */
@WebServlet("/SpringDaoTestServlet")
public class SpringDaoTestServlet extends HttpServlet {
	private SpringDaoTest dao ;
	
	public SpringDaoTest getDao() {
		return dao;
	}

	public void setDao(SpringDaoTest dao) {
		this.dao = dao;
	}

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpringDaoTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		UserInfo user = new UserInfo();
		user.setUserName((String)request.getAttribute("userName"));
		user.setPassword((String)request.getAttribute("password"));
		user.setId(System.currentTimeMillis()+"");	
		new SpringDaoTest().userAdd(user);
		
		
	}

}
