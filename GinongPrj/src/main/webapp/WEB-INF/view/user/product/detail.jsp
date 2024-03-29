<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
    <link rel="stylesheet" href="/css/user/product/detail.css" />
    <link rel="stylesheet" href="/css/icon.css" />
    <link rel="stylesheet" href="/css/font.css" />
    <link rel="stylesheet" href="/css/util.css" />
    <title>기농이네</title>
  </head>

  <body>
    <!-- ========================== 헤더 ====================================== -->
    <header class="root-header">
      <!--헤더콘텐츠-->
      <div class="content">
        <h1>
          <a href="" class="logo">
            <span class="img img-logo">로고</span>
            <span>기농이네</span>
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
              <li>
                <a href="" class="icon icon-search">검색</a>
              </li>
              <li>
                <a href="" class="icon icon-cart">장바구니</a>
              </li>
              <li>
                <a href="" class="icon icon-my-page"> 마이페이지</a>
              </li>
              <li>
                <a href="" class="icon icon-menu">메뉴버튼</a>
              </li>
            </ul>
          </nav>
        </div>
      </div>
    </header>

    <!-- ========================== 메인 ====================================== -->
    <main>
      <section class="info">
        <h1 class="d-none">상품 정보</h1>
        <div class="img img-carrot">상품 이미지</div>
        <div class="name">${product.korName}</div>
        <div class="price">${product.price}원</div>
      </section>
      <section class="option-box">
        <h1 class="d-none">옵션 박스</h1>
        <div>
          <a href="">
            <span class="icon icon-like icon-size:3">추천 아이콘</span>
            <span class="like">${product.like}</span>
          </a>
        </div>
        <div class="bar"></div>
        <div>
          <a href="">
            <span class="icon icon-share icon-size:3">공유하기 아이콘</span>
            <span class="share">공유하기</span>
          </a>
        </div>
      </section>
      <nav class="detail">
        <h1 class="d-none">상품 상세</h1>
        <ul>
          <li><a href="">상품정보</a></li>
          <li><a href="">후기</a></li>
          <li><a href="">상품Q&A</a></li>
        </ul>
      </nav>
    </main>

    <!-- ========================== 하단 메뉴 ====================================== -->
    <nav class="m-navi">
      <h1>네비게이션바</h1>
      <ul>
        <li>
          <a href="">
            <span class="icon icon-heart icon-size:3">찜하기</span>
          </a>
        </li>
        <li>
          <a href="">
            <span class="button-cart">장바구니</span>
          </a>
        </li>
        <li>
          <a href="">
            <span class="button-purchase">구매하기</span>
          </a>
        </li>
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
