package com.spring.finalpro.product.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.spring.finalpro.product.dto.ReviewDTO;

public interface ProductController {
   // 상품 리스트 화면 출력 (카테고리 값 받아서 출력하도록)
   public ModelAndView listProducts(HttpServletRequest request, HttpServletResponse response);

	// 상품 디테일 화면 출력
	public ModelAndView detailProduct(String productNo, HttpServletRequest request, 
			HttpServletResponse response) throws Exception;
	
	// 후기 입력창 출력
	public ModelAndView reviewForm(@ModelAttribute("review") ReviewDTO review, HttpServletRequest request, HttpServletResponse response) throws Exception;
	// 후기 입력
	public ResponseEntity insertReview(MultipartHttpServletRequest mRequest, HttpServletResponse response) throws Exception;

	// 후기 수정 폼
	public ModelAndView modifyReviewForm(@RequestParam("orderNo") int orderNo, HttpServletRequest request, HttpServletResponse response) throws Exception;
	// 후기 수정
	public ResponseEntity updateReview(MultipartHttpServletRequest request, HttpServletResponse response) throws Exception;
	// 후기 삭제
	public ResponseEntity deleteReview(@RequestParam("orderNo") int orderNo, HttpServletRequest request, HttpServletResponse response) throws Exception;

	

	// 상품 검색 리스트 화면 출력
	public ModelAndView searchList(@RequestParam("keyword") String keyword, HttpServletRequest request, HttpServletResponse response) throws Exception;
	// 상품 검색 상세 리트스 화면 출력
	public ModelAndView searchDetailList(@RequestParam("keyword") String keyword, @RequestParam("category") String category, @RequestParam(value = "orderBy", required = false) String orderBy, HttpServletRequest request, HttpServletResponse response) throws Exception;
		
		
	}
	
	

