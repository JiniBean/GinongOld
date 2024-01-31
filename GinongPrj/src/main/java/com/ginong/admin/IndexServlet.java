package com.ginong.admin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/admin/index")
public class IndexServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//관리자 페이지의 메뉴를 넘겨야 할듯.	
		
		//1.오늘의 총 주문 건수
		request.setAttribute("orderCnt", response);
		//2.재고현황
		request.setAttribute("stock", response);
		//3.문의사항 건수	
		request.setAttribute("questionsCnt", response);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
