package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class Cart implements Serializable{
	
	private int id;
	
	private String goodsName;
	
	private int Price;
	
	private int count;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public int getPrice() {
		return Price;
	}
	
	public void setPrice(int Price) {
		this.Price = Price;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

}
