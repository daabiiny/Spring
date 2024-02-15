package com.itbank.model;

import java.util.Date;

//	IDX           NOT NULL NUMBER 
//	SALESDATE              DATE   
//	PRODUCT_IDX   NOT NULL NUMBER 
//	PRODUCTAMOUNT          NUMBER 

public class SalesDTO {
	
	private int idx;
	private Date salesDate;
	private int product_idx;
	private int productAmount;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}
	public int getProduct_idx() {
		return product_idx;
	}
	public void setProduct_idx(int product_idx) {
		this.product_idx = product_idx;
	}
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	
}
