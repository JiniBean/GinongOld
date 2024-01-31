//package com.ginong.user;
//
//
//import java.io.IOException;
//import java.util.List;
//
//import com.ginong.user.product.entity.Product;
//import com.ginong.user.product.repository.ProductRepository;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@WebServlet("/user/index")
//public class IndexServlet extends HttpServlet{
//
//	//속성정의
//	private Product product;
//	private ProductRepository pdRepository;
//	
//	//생성자 : 생성자에서 타 객체 생성 시 해당 객체와 타 객체는 생명 주기를 함께 한다.
//	public IndexServlet() {
//		
//		product = new Product();
//		pdRepository = new ProductRepository();
//	}
//	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		//인덱스 화면 상단의 베스트, 특가, 추천 각각 1개의 데이터 DB 조회?
//		Product bestPd =  product.getBestProduct();
//		Product specialPd =  product.getSpecialProduct();
//		Product recommendPd = product.getRecommendProduct();
//		
//		request.setAttribute("bestPd", bestPd);
//		request.setAttribute("specialPd", specialPd);
//		request.setAttribute("recommendPd", recommendPd);
//		
//		/***********************************************************************/
//		
//		//시즌아웃(임박)상품
//		//List<Product> seasonOutList = new ArrayList<Product>();
//		List<Product> seasonOutList = pdRepository.findSeasonOutList();
//		request.setAttribute("ssoList", seasonOutList);
//		
//		//얼리버드(EarlyBird)
//		List<Product> earlyBirdList = pdRepository.findEarlyBirdList();
//		request.setAttribute("earBirdList", seasonOutList);
//		
//		//배너(Banner) 이미지 : DB로 이미지 관리?
//		request.setAttribute("bannerImg", "banner.jpg");
//		request.getRequestDispatcher("index.jsp").forward(request, response);
//	}
//}
