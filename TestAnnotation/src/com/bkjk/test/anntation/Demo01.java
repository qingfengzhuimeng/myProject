package com.bkjk.test.anntation;

/**   
 * @ClassName: Demo01   
 * @Description: TODO
 * @version: 1.0
 * @author: jiabao.yan 
 * @date: 2018-1-20 ÉÏÎç1:53:37     
 * @Copyright: 2018 www.yjb.com Inc. All rights reserved. 
 */
@MyTable("orderTable")
public class Demo01 {
	
	@MyField(ColumnName="id",ColumnType="String",length=10)
	private String id;
	@MyField(ColumnName="order_id",ColumnType="String",length=10)
    private String orderId;
	@MyField(ColumnName="order_name",ColumnType="String",length=10)
	private int orderName;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getOrderName() {
		return orderName;
	}
	public void setOrderName(int orderName) {
		this.orderName = orderName;
	}
	@Override
	public String toString() {
		return "Demo01 [id=" + id + ", orderId=" + orderId + ", orderName="
				+ orderName + "]";
	}
	         
}
