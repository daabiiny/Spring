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
