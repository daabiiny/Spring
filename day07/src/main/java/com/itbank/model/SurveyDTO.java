package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

//	IDX      NOT NULL NUMBER        
//	WRITER   NOT NULL VARCHAR2(100) 
//	TITLE    NOT NULL VARCHAR2(400) 
//	IMAGEA   NOT NULL VARCHAR2(600) 
//	CONTENTA NOT NULL VARCHAR2(200) 
//	IMAGEB   NOT NULL VARCHAR2(600) 
//	CONTENTB NOT NULL VARCHAR2(200) 

public class SurveyDTO {

	private int idx;
	private String writer;
	private String title;
	private String imageA;
	private String contentA;
	private String imageB;
	private String contentB;
	
	private MultipartFile uploadA;
	private MultipartFile uploadB;
	
	private double choice1Rate;
	private double choice2Rate;
	private int responseCount;
	private int choice1Count;
	private int choice2Count;
	
	
	public double getChoice1Rate() {
		return choice1Rate;
	}
	public void setChoice1Rate(double choice1Rate) {
		this.choice1Rate = choice1Rate;
	}
	public double getChoice2Rate() {
		return choice2Rate;
	}
	public void setChoice2Rate(double choice2Rate) {
		this.choice2Rate = choice2Rate;
	}
	public int getResponseCount() {
		return responseCount;
	}
	public void setResponseCount(int responseCount) {
		this.responseCount = responseCount;
	}
	public int getChoice1Count() {
		return choice1Count;
	}
	public void setChoice1Count(int choice1Count) {
		this.choice1Count = choice1Count;
	}
	public int getChoice2Count() {
		return choice2Count;
	}
	public void setChoice2Count(int choice2Count) {
		this.choice2Count = choice2Count;
	}
	public MultipartFile getUploadA() {
		return uploadA;
	}
	public void setUploadA(MultipartFile uploadA) {
		this.uploadA = uploadA;
	}
	public MultipartFile getUploadB() {
		return uploadB;
	}
	public void setUploadB(MultipartFile uploadB) {
		this.uploadB = uploadB;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageA() {
		return imageA;
	}
	public void setImageA(String imageA) {
		this.imageA = imageA;
	}
	public String getContentA() {
		return contentA;
	}
	public void setContentA(String contentA) {
		this.contentA = contentA;
	}
	public String getImageB() {
		return imageB;
	}
	public void setImageB(String imageB) {
		this.imageB = imageB;
	}
	public String getContentB() {
		return contentB;
	}
	public void setContentB(String contentB) {
		this.contentB = contentB;
	}
	
	
}
