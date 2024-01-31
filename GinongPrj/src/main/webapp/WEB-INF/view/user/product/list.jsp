<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="/css/reset.css" />
<link rel="stylesheet" href="/css/style.css" />
<link rel="stylesheet" href="/css/img.css" />
<link rel="stylesheet" href="/css/components/header.css" />
<link rel="stylesheet" href="/css/components/main.css" />
<link rel="stylesheet" href="/css/components/navi.css" />
<link rel="stylesheet" href="/css/icon.css" />
<link rel="stylesheet" href="/css/font.css" />
<link rel="stylesheet" href="/css/util.css" />
<link rel="stylesheet" href="/css/user/product/list.css" />
<title>기농이네</title>
</head>
<body>
	<!-- ========================== 헤더 ====================================== -->
	<header class="root-header">
		<!--헤더콘텐츠-->
		<div class="content">
			<h1>
				<a href="" class="logo"> <span class="img img-logo">로고</span> <span>기농이네</span>
				</a>
			</h1>

			<div class="quick">
				<nav>
					<h1>top</h1>
					<ul class="top">
						<li><a href="">로그인</a></li>
						<li><a href="">회원가입</a></li>
					</ul>
				</nav>

				<nav>
					<h1>down</h1>
					<ul class="down">
						<li><a href="" class="icon icon-search">검색</a></li>
						<li><a href="" class="icon icon-cart">장바구니</a></li>
						<li><a href="" class="icon icon-my-page"> 마이페이지</a></li>
						<li><a href="" class="icon icon-menu">메뉴버튼</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</header>

	<!-- ========================== 메인 ====================================== -->
	<main>
		<!-- -------------------------- 카테고리  ------------------------------------- -->
		<nav class="category">
			<h1>카테고리</h1>
			<ul class="content">
				<li><a href="">과채</a></li>
				<li><a href="">양념</a></li>
				<li><a href="">가공식품</a></li>
				<li><a href="">공지사항</a></li>
				<li><a href="">고객센터</a></li>
			</ul>
		</nav>

		<!-- 반장 -->
		<nav class="order-category">
			<h1 class="d-none">정렬 카테고리</h1>
			<ul>
				<li><a href="" class="icon icon-list-sort-button">리스트정렬버튼</a></li>
				<li><a href="">가격순</a></li>
				<li></li>
				<li><a href="">추천순</a></li=>
			</ul>
		</nav>


		<section class="sub-main">
			<c:forEach var="list" items="${list}">
				<div class="card-row">
					<a href="detail?productId=${list.productId}"> <img src="/img/cabbage.jpg" alt="배추" /> <span>${list.korName}</span>
						<span>${list.price} 원</span>
					</a>
				</div>
			</c:forEach>
		</section>


	</main>

	<!-- ========================== 하단 메뉴 ====================================== -->
	<nav class="m-navi">
		<h1>네비게이션바</h1>
		<ul>
			<li><a href=""> <span class="icon icon-menu">전체메뉴 아이콘</span>
					<span>전체메뉴</span>
			</a></li>
			<li><a href=""> <span class="icon icon-home">홈 아이콘</span> <span>홈</span>
			</a></li>
			<li><a href=""> <span class="icon icon-my-page">마이페이지
						아이콘</span> <span>마이페이지</span>
			</a></li>
			<li><a href=""> <span class="icon icon-recent-product">최근
						본 상품 아이콘</span> <span>최근 본 상품</span>
			</a></li>
		</ul>
	</nav>

	<!-- ========================== 전체 메뉴 ====================================== -->
	<nav class="hall-menu">
		<h1>메인메뉴</h1>
		<ul>
			<li><a href="">과채</a></li>
			<li><a href="">양념</a></li>
			<li><a href="">가공식품</a></li>
			<li><a href="">공지사항</a></li>
			<li><a href="">고객센터</a></li>
		</ul>
	</nav>
</body>
</html>
