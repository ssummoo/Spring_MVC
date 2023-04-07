package kr.co.softsoldesk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.softsoldesk.model.Test2Service;

@WebServlet("*.mvc")
public class Homecontroller extends HttpServlet{

	public Homecontroller() {
	
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Homecontroller");
		/*
		 
		//요청주소 가져오기
		//contoller 역할 : 요청주소 분기
		String url=request.getRequestURI();
		System.out.println(url);
		String viewName=null;
		
		if(url.contains("main.mvc")) {
			System.out.println("main요청");
			viewName="main.jsp";
		}else if(url.contains("test1.mvc")) {
			System.out.println("test1요청");
			viewName="test1.jsp";
		}else if(url.contains("test2.mvc")) {
			System.out.println("test2요청");
			viewName="test2.jsp";
		}
		RequestDispatcher dis=request.getRequestDispatcher(viewName);
		dis.forward(request, response);
		 */
		String url=request.getRequestURI();
		System.out.println(url);
		String viewName=null;
		
		if(url.contains("main.mvc")) {
			System.out.println("main요청");
			viewName="main.jsp";
		}else if(url.contains("test1.mvc")) {
			//파라미터 데이터 추출
			/*
			String str1=request.getParameter("data1");
			String str2=request.getParameter("data2");
			int data1=Integer.parseInt(str1);
			int data2=Integer.parseInt(str2);
			 */
			
			int number1=Integer.parseInt(request.getParameter("data1"));
			int number2=Integer.parseInt(request.getParameter("data2"));
			int result = number1+number2;
			request.setAttribute("result", result);
			viewName="test1.jsp";

		}else if(url.contains("test2.mvc")) {
			int result = Test2Service.minus(request);
			request.setAttribute("result", result);			
			viewName="test2.jsp";
		}
		RequestDispatcher dis=request.getRequestDispatcher(viewName);
		dis.forward(request, response);
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.doPost(request, response);
	}
	
}
