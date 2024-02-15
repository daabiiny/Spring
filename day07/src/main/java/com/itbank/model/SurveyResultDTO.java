package com.itbank.model;

//	IDX          NOT NULL NUMBER        
//	TITLE        NOT NULL VARCHAR2(400) 
//	CONTENTA     NOT NULL VARCHAR2(200) 
//	CONTENTB     NOT NULL VARCHAR2(200) 
//	IMAGEA       NOT NULL VARCHAR2(600) 
//	IMAGEB       NOT NULL VARCHAR2(600) 
//	WRITER                VARCHAR2(500) 
//	CHOICE                NUMBER        
//	CHOICE1_RATE          NUMBER        
//	CHOICE2_RATE          NUMBER 

public class SurveyResultDTO {

	private int idx;
	private String title;
	private String contentA;
	private String contentB;
	private String imageA;
	private String imageB;
	private String writer;
	private int choice;
	private int choice1_rate;
	private int choice2_rate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContentA() {
		return contentA;
	}
	public void setContentA(String contentA) {
		this.contentA = contentA;
	}
	public String getContentB() {
		return contentB;
	}
	public void setContentB(String contentB) {
		this.contentB = contentB;
	}
	public String getImageA() {
		return imageA;
	}
	public void setImageA(String imageA) {
		this.imageA = imageA;
	}
	public String getImageB() {
		return imageB;
	}
	public void setImageB(String imageB) {
		this.imageB = imageB;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public int getChoice1_rate() {
		return choice1_rate;
	}
	public void setChoice1_rate(int choice1_rate) {
		this.choice1_rate = choice1_rate;
	}
	public int getChoice2_rate() {
		return choice2_rate;
	}
	public void setChoice2_rate(int choice2_rate) {
		this.choice2_rate = choice2_rate;
	}
	
	

}
