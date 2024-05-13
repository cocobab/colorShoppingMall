package com.spring.finalpro.product.dto;


import lombok.Data;


//product_(base, image, size), review table join
@Data
public class Product_totalDTO {
	private String productNo; //상품번호
	private String parentProductNo; //같은 상품의 부모키
	private String name; //상품 이름
	private String brand; //상품 브랜드
	private String brandEng; //상품 브랜드(영어)
	private String price; // 상품 가격
	private String category; //상품 대분류
	private String subCategory; //상품 중분류
	private String color1;
	private String color2;
	private String color3;
	private String material;
	
	private String imageFileName;
	
	private String productSize; 
	private double topTotalLength; 
	private double shoulderLength; 
	private double chestCrossLength; 
	private double sleevelength; 
	private double waistCrossLength; 
	private double hipCrossLength; 
	private double thighCrossLength; 
	private double riseLength; 
	private double hemCrossLength; 
	private double footLength; 
	private double ballOfFoot; 
	private double ankleHeight; 
	private double instepHeight;
	
    private float avg_starScore; 
    private int review_count;
    
    
	
}
