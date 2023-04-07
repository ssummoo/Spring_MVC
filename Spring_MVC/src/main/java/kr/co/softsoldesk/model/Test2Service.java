package kr.co.softsoldesk.model;

import javax.servlet.http.HttpServletRequest;

public class Test2Service {

	public static int minus(HttpServletRequest request) {
		
		int number1 = Integer.parseInt(request.getParameter("data1"));
		int number2 = Integer.parseInt(request.getParameter("data2"));

		int result=number1-number2;
		
		return result;
		
	}
	
}
